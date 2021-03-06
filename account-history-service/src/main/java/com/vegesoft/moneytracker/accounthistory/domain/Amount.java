package com.vegesoft.moneytracker.accounthistory.domain;

import java.math.BigDecimal;

public final class Amount {

    private final BigDecimal value;

    public Amount(final BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
