package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PurchaseValidator {

    private static List<PurchaseValidationProcessor> PURCHASE_VALIDATION_CHAIN;

    public PurchaseValidator(PasswordProcessor passwordProcessor) {
        PURCHASE_VALIDATION_CHAIN = List.of(passwordProcessor);
    }

    public void validate(PurchaseRequestDTO purchaseRequestDTO) {
        for (PurchaseValidationProcessor purchaseValidationProcessor : PURCHASE_VALIDATION_CHAIN) {
            purchaseValidationProcessor.process(purchaseRequestDTO);
        }
    }
}
