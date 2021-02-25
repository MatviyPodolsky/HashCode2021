package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    List<String> streets = new ArrayList<>();

    public Intersection() {
    }

    public void addStreet(String street) {
        streets.add(street);
    }

    public List<String> getStreets() {
        return streets;
    }
}
