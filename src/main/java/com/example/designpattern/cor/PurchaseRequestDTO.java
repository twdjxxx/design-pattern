package com.example.designpattern.cor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseRequestDTO {
    private String productId;
    private String userId;
    private String paymentPassword;
    private String userAddress;
}
