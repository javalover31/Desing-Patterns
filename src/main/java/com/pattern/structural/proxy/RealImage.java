package com.pattern.structural.proxy;

public class RealImage implements Image{
    String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadfromDisk();
    }

    @Override
    public void display() {
        System.out.println(imageName);
    }

    public void loadfromDisk(){
        System.out.println("load from disk");
    }
}
