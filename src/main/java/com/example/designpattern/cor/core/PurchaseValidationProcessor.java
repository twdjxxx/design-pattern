package com.example.designpattern.cor.core;

import com.example.designpattern.cor.PurchaseRequestDTO;

public interface PurchaseValidationProcessor {
    void process(PurchaseRequestDTO context);
}
