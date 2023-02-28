package ru.neoflex.deal.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.neoflex.deal.model.CreditDTO;
import ru.neoflex.deal.model.LoanApplicationRequestDTO;
import ru.neoflex.deal.model.LoanOfferDTO;
import ru.neoflex.deal.model.ScoringDataDTO;

import java.util.List;

@FeignClient(url = "${client.conveyor.endpoint}", name = "CONVEYOR-FEIGN-CLIENT")
public interface ConveyorClient {

    @PostMapping("/offers")
    ResponseEntity<List<LoanOfferDTO>> offers(@RequestBody LoanApplicationRequestDTO request);

    @PostMapping("/calculation")
    ResponseEntity<CreditDTO> calculate(@RequestBody ScoringDataDTO scoringData);
}
