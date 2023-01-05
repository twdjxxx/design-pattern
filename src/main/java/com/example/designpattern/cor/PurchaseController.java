package com.example.designpattern.cor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseValidationService purchaseValidationService;

    @PostMapping
    public PurchaseResultDTO purchase(PurchaseRequestDTO purchaseRequestDTO) {
        purchaseValidationService.validate(purchaseRequestDTO);
        return PurchaseResultDTO.success();
    }
}
