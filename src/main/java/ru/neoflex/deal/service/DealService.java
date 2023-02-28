package ru.neoflex.deal.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.deal.client.ConveyorClient;
import ru.neoflex.deal.model.*;
import ru.neoflex.deal.persist.model.Application;
import ru.neoflex.deal.persist.model.Client;
import ru.neoflex.deal.persist.model.Credit;
import ru.neoflex.deal.persist.model.CreditStatus;
import ru.neoflex.deal.persist.repository.ApplicationRepository;
import ru.neoflex.deal.persist.repository.ClientRepository;
import ru.neoflex.deal.persist.repository.CreditRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DealService {

    private final ApplicationRepository applicationRepository;
    private final ClientRepository clientRepository;
    private final CreditRepository creditRepository;
    private final ConveyorClient conveyorClient;

    public List<LoanOfferDTO> createApplication(LoanApplicationRequestDTO loanAppReq) {
        Client client = createClient(loanAppReq);
        Application application = applicationRepository.save(
                Application.builder()
                        .client(client)
                        .creationDate(new Date())
                        .status(ApplicationStatus.PREAPPROVAL)
                        .statusHistory(List.of(
                                ApplicationStatusHistoryDTO.builder()
                                        .status(ApplicationStatus.PREAPPROVAL)
                                        .time(LocalDateTime.now())
                                        .changeType(ApplicationStatusHistoryDTO.ChangeTypeEnum.AUTOMATIC)
                                        .build()
                        ))
                        .build());
        return conveyorClient.offers(loanAppReq).getBody().stream()
                .peek(str -> str.setApplicationId(application.getApplicationId()))
                .collect(Collectors.toList());
    }

    public void acceptOffer(LoanOfferDTO loanOffer) {
        Application application = applicationRepository.findById(loanOffer.getApplicationId()).orElse(null);
        if (application == null) {
            return;
        }
        application.getStatusHistory().add(
                ApplicationStatusHistoryDTO.builder()
                        .status(ApplicationStatus.APPROVED)
                        .time(LocalDateTime.now())
                        .changeType(ApplicationStatusHistoryDTO.ChangeTypeEnum.MANUAL)
                        .build()
        );
        application.setAppliedOffer(loanOffer);
        application.setStatus(ApplicationStatus.APPROVED);
        applicationRepository.save(application);
    }

    private Client createClient(LoanApplicationRequestDTO loanAppReq) {
        return clientRepository.save(Client.builder()
                .firstName(loanAppReq.getFirstName())
                .lastName(loanAppReq.getLastName())
                .middleName(loanAppReq.getMiddleName())
                .birthDate(loanAppReq.getBirthdate())
                .passport(PassportInfo.builder()
                        .series(loanAppReq.getPassportSeries())
                        .number(loanAppReq.getPassportNumber())
                        .build()
                )
                .email(loanAppReq.getEmail())
                .build()
        );
    }

    public void calculate(Long applicationId, FinishRegistrationRequestDTO req) {
        Application application = applicationRepository.findById(applicationId).orElseThrow(RuntimeException::new);
        LoanOfferDTO appliedOffer = application.getAppliedOffer();
        Client client = application.getClient();
        ScoringDataDTO scoringData = ScoringDataDTO.builder()
                .isInsuranceEnabled(appliedOffer.getIsInsuranceEnabled())
                .isSalaryClient(appliedOffer.getIsSalaryClient())
                .birthdate(client.getBirthDate())
                .firstName(client.getFirstName())
                .middleName(client.getMiddleName())
                .lastName(client.getLastName())
                .passportSeries(client.getPassport().getSeries())
                .passportNumber(client.getPassport().getNumber())
                .term(appliedOffer.getTerm())
                .amount(appliedOffer.getTotalAmount())
                .dependentAmount(req.getDependentAmount())
                .account(req.getAccount())
                .gender(ScoringDataDTO.GenderEnum.fromValue(
                        req.getGender().getValue()))
                .maritalStatus(ScoringDataDTO.MaritalStatusEnum.fromValue(
                        req.getMaritalStatus().getValue()
                ))
                .build();

        CreditDTO creditDTO = conveyorClient.calculate(scoringData).getBody();
        Credit credit = creditRepository.save(
                Credit.builder()
                        .amount(creditDTO.getAmount())
                        .insuranceEnable(creditDTO.getIsInsuranceEnabled())
                        .monthlyPayment(creditDTO.getMonthlyPayment())
                        .paymentSchedule(creditDTO.getPaymentSchedule())
                        .creditStatus(CreditStatus.CALCULATED)
                        .salaryClient(creditDTO.getIsSalaryClient())
                        .psk(creditDTO.getPsk())
                        .rate(creditDTO.getPsk())
                        .term(creditDTO.getTerm())
                        .build()
        );
        application.getStatusHistory().add(ApplicationStatusHistoryDTO.builder()
                .status(ApplicationStatus.CC_APPROVED)
                .changeType(ApplicationStatusHistoryDTO.ChangeTypeEnum.AUTOMATIC)
                .time(LocalDateTime.now())
                .build());
        applicationRepository.save(application
                .setStatus(ApplicationStatus.CC_APPROVED)
                .setCredit(credit));
    }
}
