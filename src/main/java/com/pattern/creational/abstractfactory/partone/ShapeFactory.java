package com.pattern.creational.abstractfactory.partone;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("Square"))
            return new Square();
        else if (type.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return  null;
    }
}
