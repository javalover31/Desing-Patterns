package com.pattern.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Vehicle bike = new Bike(new Assemble(),new Producer());
        Vehicle car = new Car(new Assemble(),new Producer());
        bike.displayName();
        car.displayName();
    }
}
