package com.example.demo.model;

import java.math.BigDecimal;

public enum Section {
    PRODUCTION(new BigDecimal(2600)), SALES(new BigDecimal(3200)), IT(new BigDecimal(3400)), LABORATORY(new BigDecimal(4200)), CONTROL(new BigDecimal(2900));

    private BigDecimal payment;

    Section(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getPayment() {
        return payment;
    }
}