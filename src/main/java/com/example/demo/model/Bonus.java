package com.example.demo.model;

import java.math.BigDecimal;

public enum Bonus {
    NO_BONUS(new BigDecimal(0)), WASHING_CLOTHES(new BigDecimal(50)), HARMFUL_PLACE(new BigDecimal(500)), DRINK_AND_EAT(new BigDecimal(20));

    private BigDecimal bonus;


    Bonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}