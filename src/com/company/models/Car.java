package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    int countStreets;
    List<String> streets = new ArrayList<>();

    public Car(int countStreets) {
        this.countStreets = countStreets;
    }

    public void addStreet(String s) {
        streets.add(s);
    }
}
