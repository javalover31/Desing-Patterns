package com.pattern.structural.bridge;

public class Assemble implements Workshop{

    @Override
    public void work() {
        System.out.println(" - Assemble");
    }
}
