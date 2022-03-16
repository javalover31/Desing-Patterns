package com.pattern.creational.factory;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {
    public Shape getShape(String type){
        if (type==null)
            return null;
        if (type.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (type.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if (type.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;

    }
}
