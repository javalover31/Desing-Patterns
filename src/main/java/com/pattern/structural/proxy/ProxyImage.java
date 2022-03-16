package com.pattern.structural.proxy;

public class ProxyImage implements Image{
    RealImage realImage;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    String imageName;

    @Override
    public void display() {
        if (realImage == null){
            System.out.println("jhjk");
            realImage = new RealImage(imageName);
                    }

        realImage.display();
    }
}
