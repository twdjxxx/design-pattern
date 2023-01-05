package com.example.designpattern.cor;

import com.example.designpattern.cor.core.PurchaseValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {
    private final PurchaseValidator purchaseValidator;

    public PurchaseResultDTO purchase(PurchaseRequestDTO purchaseRequestDTO) {
        purchaseValidator.validate(purchaseRequestDTO);
        return PurchaseResultDTO.success();
    }
}
