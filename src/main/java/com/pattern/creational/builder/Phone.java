package com.pattern.creational.builder;

public final class Phone {
    private final String os;
    private final String ram;
    private final int screenSize;
    private final int Camera;

    public Phone(String os, String ram, int screenSize, int camera) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
        Camera = camera;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", screenSize=" + screenSize +
                ", Camera=" + Camera +
                '}';
    }
}
