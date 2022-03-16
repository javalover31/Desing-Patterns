package com.pattern.creational.abstractfactory.partone;

public class RoundShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("RoundRectangle"))
            return new RoundRectangle();
        else if (type.equalsIgnoreCase("RoundSquare"))
            return new RoundSquare();
        return null;
    }
}
