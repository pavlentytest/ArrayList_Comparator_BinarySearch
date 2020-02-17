package com.company;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String name;
    private int power;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public Car(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Car car) {
        return this.getPower() - car.getPower();
    }
}
