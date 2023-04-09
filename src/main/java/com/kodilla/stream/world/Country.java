package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal peopleQuantity;
    public String name;

    public Country(BigDecimal peopleQuantity, String name) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
