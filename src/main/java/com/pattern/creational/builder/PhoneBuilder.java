package com.pattern.creational.builder;

public class PhoneBuilder {
    private String os;
    private String ram;
    private int screenSize;
    private int Camera;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        Camera = camera;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,ram,screenSize,Camera);
    }
}
