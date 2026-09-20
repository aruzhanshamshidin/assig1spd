package com.vehicle.factorymethod;

public class twowheelerfactory implements vehiclefactory {
    @Override
    public vehicle createvehicle() {
        return new twowheeler();
    }
}