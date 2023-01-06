package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductInventoryProcessor implements PurchaseValidationProcessor{

    @Override
    public void process(PurchaseRequestDTO context) {
        final int productInventory = getProductInventory(context.getProductId());
        if(productInventory == 0) {
            throw new RuntimeException("Not enough inventory");
        }
    }

    private int getProductInventory(String productId) {
        return 5;
    }
}
