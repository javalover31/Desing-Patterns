package com.pattern.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape rectangleShape = new RectangleShape();
        ShapeDecorator shapeDecorator = new RedShape(rectangleShape);
        shapeDecorator.draw();

        Shape circleShape = new CircleShape();
        ShapeDecorator  shapeDecorator1 = new RedShape(circleShape);
        shapeDecorator1.draw();
    }
}
