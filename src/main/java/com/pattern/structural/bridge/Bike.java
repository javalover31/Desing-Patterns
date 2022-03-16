package com.pattern.structural.bridge;

public class Bike extends Vehicle {

    public Bike(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1,workShop2);
    }
    @Override
    public void displayName() {
        System.out.println("Bike ");
        workShop1.work();
        workShop2.work();
    }
}
