package com.vehicle.abstractfactory;

public class bikeengine implements engine {
    @Override
    public void spec() {
        System.out.println("engine: 150cc single-cylinder.");
    }
}