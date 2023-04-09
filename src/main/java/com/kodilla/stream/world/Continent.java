package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> listOfCountries = new ArrayList<>();
    private String name;

    Continent(String name) {
        this.name = name;
    }
    void addCountry(Country country){
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
