package com.vehicle.abstractfactory;

public class cartire implements tire {
    @Override
    public void spec() {
        System.out.println("tires: 4 standard passenger car tires.");
    }
}