package ru.neoflex.deal.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.auditproducer.aop.AuditAction;
import ru.neoflex.deal.model.FinishRegistrationRequestDTO;
import ru.neoflex.deal.model.LoanApplicationRequestDTO;
import ru.neoflex.deal.model.LoanOfferDTO;
import ru.neoflex.deal.service.DealService;

import java.util.List;

@RestController
@RequestMapping("/deal")
@AllArgsConstructor
public class DealController {

    private final DealService dealService;
    private static final String DEAL = "DEAL";

    @PostMapping("/application")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<List<LoanOfferDTO>> application(@RequestBody LoanApplicationRequestDTO req) {
        return ResponseEntity.ok(dealService.createApplication(req));
    }

    @PutMapping("/offer")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<Void> offer(@RequestBody LoanOfferDTO req) {
        dealService.acceptOffer(req);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/calculate/{applicationId}")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<Void> calculate(@PathVariable Long applicationId, @RequestBody FinishRegistrationRequestDTO req) {
        dealService.calculate(applicationId, req);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}/send")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<Void> send(@PathVariable Long applicationId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}/sign")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<Void> sign(@PathVariable Long applicationId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}/code")
    @AuditAction(auditService = DEAL)
    public ResponseEntity<Void> code(@PathVariable Long applicationId) {
        return ResponseEntity.ok().build();
    }
}
