package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class UserBalanceProcessor implements PurchaseValidationProcessor{

    @Override
    public void process(PurchaseRequestDTO context) {
        final BigDecimal userBalance = getUserBalance(context.getUserId());
        final BigDecimal productPrice = getProductPrice(context.getProductId());
        if(userBalance.compareTo(productPrice) < 0) {
            throw new RuntimeException("Not Enough Balance");
        }
    }

    private BigDecimal getUserBalance(String userId) {
        return BigDecimal.valueOf(100);
    }

    private BigDecimal getProductPrice(String productId) {
        return BigDecimal.valueOf(9.99);
    }
}
