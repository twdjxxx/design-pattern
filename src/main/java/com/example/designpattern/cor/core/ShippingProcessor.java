package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class ShippingProcessor implements PurchaseValidationProcessor{
    @Override
    public void process(PurchaseRequestDTO context) {
        if(!checkCanShip(context.getUserAddress())) {
            throw new RuntimeException("Cannot shipping to target address");
        }
    }

    private boolean checkCanShip(String address) {
        return true;
    }
}
