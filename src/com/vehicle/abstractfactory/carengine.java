package com.vehicle.abstractfactory;

public class carengine implements engine {
    @Override
    public void spec() {
        System.out.println("engine: 2.0l inline-4 cylinder.");
    }
}