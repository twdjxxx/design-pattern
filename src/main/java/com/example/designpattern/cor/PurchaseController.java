package com.example.designpattern.cor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @PostMapping
    public PurchaseResultDTO purchase(PurchaseRequestDTO purchaseRequestDTO) {
        return purchaseService.purchase(purchaseRequestDTO);
    }
}
