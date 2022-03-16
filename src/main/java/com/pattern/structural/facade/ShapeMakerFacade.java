package com.pattern.structural.facade;

public class ShapeMakerFacade {
    Shpe circleShape;
    Shpe rectangleShape;
    public ShapeMakerFacade() {
        circleShape = new Circle();
        rectangleShape = new Rectangle();
    }

    public void getCircleShape() {
         circleShape.drow();
    }

    public void getRectangleShape() {
        rectangleShape.drow();
    }
}
