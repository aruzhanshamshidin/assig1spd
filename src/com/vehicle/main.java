package com.vehicle;

import com.vehicle.factorymethod.*;
import com.vehicle.abstractfactory.*;

public class main {
    public static void main(String[] args) {
        //part a: factory method demo
        System.out.println("factory method demo");
        vehiclefactory bikefactory = new twowheelerfactory();
        vehicle bike = bikefactory.createvehicle();
        bike.assemble();

        vehiclefactory carfactory = new fourwheelerfactory();
        vehicle car = carfactory.createvehicle();
        car.assemble();

        System.out.println();

        // part b: abstract factory demo
        System.out.println("abstract factory demo");
        vehiclepartsfactory bikepartsfactory = new twowheelerpartsfactory();
        engine bikeengine = bikepartsfactory.createengine();
        tire biketire = bikepartsfactory.createtire();
        bikeengine.spec();
        biketire.spec();

        vehiclepartsfactory carpartsfactory = new fourwheelerpartsfactory();
        engine carengine = carpartsfactory.createengine();
        tire cartire = carpartsfactory.createtire();
        carengine.spec();
        cartire.spec();
    }
}