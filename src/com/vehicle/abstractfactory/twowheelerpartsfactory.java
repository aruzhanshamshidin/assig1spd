package com.vehicle.abstractfactory;

public class twowheelerpartsfactory implements vehiclepartsfactory {
    @Override
    public engine createengine() {
        return new bikeengine();
    }

    @Override
    public tire createtire() {
        return new biketire();
    }
}