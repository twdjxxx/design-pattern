package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class PasswordProcessor implements PurchaseValidationProcessor{

    private final Map<String, String> passwordMap = new HashMap<>();

    public PasswordProcessor() {
        passwordMap.put("JD", "123456");
    }

    @Override
    public void process(PurchaseRequestDTO context) {
        final String userId = context.getUserId();
        final String paymentPassword = context.getPaymentPassword();

        if(!passwordMap.get(userId).equals(paymentPassword)) {
            throw new RuntimeException("Incorrect password");
        }
    }
}
