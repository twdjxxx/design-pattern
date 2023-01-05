package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PasswordProcessor implements PurchaseValidationProcessor{
    @Override
    public void process(PurchaseRequestDTO context) {

    }
}
