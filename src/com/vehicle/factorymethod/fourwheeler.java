
package com.vehicle.factorymethod;

public class fourwheeler implements vehicle {
    @Override
    public void assemble() {
        System.out.println("assembling four-wheeler vehicle.");
    }
}