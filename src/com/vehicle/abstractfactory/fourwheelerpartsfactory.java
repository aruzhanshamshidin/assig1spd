package com.vehicle.abstractfactory;

public class fourwheelerpartsfactory implements vehiclepartsfactory {
    @Override
    public engine createengine() {
        return new carengine();
    }

    @Override
    public tire createtire() {
        return new cartire();
    }
}