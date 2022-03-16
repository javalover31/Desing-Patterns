package com.pattern.structural.bridge;

public abstract class Vehicle {
    Workshop workShop1;
    Workshop workShop2;
    public Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1=workShop1;
        this.workShop2=workShop2;
    }
    abstract void displayName();
}
