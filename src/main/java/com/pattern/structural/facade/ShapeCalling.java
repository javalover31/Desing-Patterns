package com.pattern.structural.facade;

public class ShapeCalling {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        shapeMakerFacade.getCircleShape();
        shapeMakerFacade.getRectangleShape();
    }
}
