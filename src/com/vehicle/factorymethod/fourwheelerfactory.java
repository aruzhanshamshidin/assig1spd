package com.vehicle.factorymethod;

public class fourwheelerfactory implements vehiclefactory {
    @Override
    public vehicle createvehicle() {
        return new fourwheeler();
    }
}