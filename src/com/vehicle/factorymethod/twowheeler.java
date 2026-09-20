package com.vehicle.factorymethod;

public class twowheeler implements vehicle {
    @Override
    public void assemble() {
        System.out.println("assembling two-wheeler vehicle.");
    }
}