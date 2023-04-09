package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = new World();
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country( new BigDecimal("38386000"), "Poland"));
        europe.addCountry(new Country(new BigDecimal("83190556"), "UK"));
        europe.addCountry(new Country(new BigDecimal("67156000"), "Holland"));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country(new BigDecimal("1403500365"), "Vietnam"));
        asia.addCountry(new Country(new BigDecimal("1352642280"), "Japan"));
        asia.addCountry(new Country( new BigDecimal("273523615"), "Thailand"));
        Continent africa = new Continent("Africa");
        africa.addCountry(new Country(new BigDecimal("12234568865"), "Zambia"));
        africa.addCountry(new Country(new BigDecimal("872509095424"), "Kenya"));
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("887962063105");
        assertEquals(expectedPeople, totalPeople);
    }
}