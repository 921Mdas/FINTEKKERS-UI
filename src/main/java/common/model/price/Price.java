package common.model.price;

import common.model.RawDataModelObject;
import common.model.security.Security;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

import static common.model.security.CashSecurity.USD;

public class Price extends RawDataModelObject {
    private final Security security;
    private BigDecimal price;

    public Price(UUID id, BigDecimal price, Security security, ZonedDateTime asOf) {
        super(id, asOf);
        this.price = price;
        this.security = security;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Security getSecurity() {
        return security;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static Price getPrice(BigDecimal price, Security sec) {
        return new Price(UUID.randomUUID(), price, sec, ZonedDateTime.now());
    }

    public static Price CASH_PRICE = new Price(UUID.randomUUID(), BigDecimal.ONE, USD, USD.getAsOf());

    public static Price getCashPrice() {
        return CASH_PRICE;
    }

    @Override
    public String toString() {
        return price.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Objects.equals(id, price1.id) && Objects.equals(getAsOf(), price1.getAsOf());
    }
}
