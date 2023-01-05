package com.example.designpattern.cor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseResultDTO {
    private boolean purchaseSuccess;

    public static PurchaseResultDTO success() {
        PurchaseResultDTO result = new PurchaseResultDTO();
        result.setPurchaseSuccess(true);
        return result;
    }
}
