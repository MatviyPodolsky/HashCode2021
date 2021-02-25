package com.company.models;

import java.util.Scanner;

public class InputData {

    int duration;
    int intersectionsCount;
    int streetsCount;
    int cars;
    int bonus;
    Intersection[] intersections;
    Street[] streets;

    public InputData(int duration, int intersectionsCount, int streetsCount, int cars, int bonus) {
        this.duration = duration;
        this.intersectionsCount = intersectionsCount;
        this.streetsCount = streetsCount;
        this.cars = cars;
        this.bonus = bonus;
        this.streets = new Street[streetsCount];
        intersections = new Intersection[intersectionsCount];
    }

    public void fillData(Scanner sc) {
        for (int i = 0; i < intersectionsCount; i++) {
            intersections[i] = new Intersection();
        }
        for (int i = 0; i < streetsCount; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            String name = sc.next();
            int time = sc.nextInt();
            streets[i] = new Street(start, end, name, time);
            intersections[start].addStreet(name);
            intersections[end].addStreet(name);
        }
    }


}
