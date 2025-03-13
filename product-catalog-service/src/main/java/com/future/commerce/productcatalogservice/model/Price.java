package com.future.commerce.productcatalogservice.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Price {

    private BigDecimal amount;
    private String currency; // e.g., USD, EUR

    public Price() {}

    public Price(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount) && Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}