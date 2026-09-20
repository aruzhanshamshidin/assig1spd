package com.vehicle.abstractfactory;

public class biketire implements tire {
    @Override
    public void spec() {
        System.out.println("tires: 2 narrow motorcycle tires.");
    }
}
