package com.pattern.creational.abstractfactory.parttwo;

import com.pattern.creational.abstractfactory.partone.AbstractFactory;
import com.pattern.creational.abstractfactory.partone.Shape;

public class Demo {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        System.out.println("Round Shape Factory");
        AbstractFactory abstractFactory1 = factoryProducer.getFactory(true);
        Shape shape1 = abstractFactory1.getShape("RoundRectangle");
        shape1.draw();
        Shape shape2 = abstractFactory1.getShape("RoundSquare");
        shape2.draw();

        System.out.println("---------------------");
        System.out.println("Shape Factory");
        AbstractFactory abstractFactory2 = factoryProducer.getFactory(false);
        Shape shape3 = abstractFactory2.getShape("Square");
        shape3.draw();
        Shape shape4 = abstractFactory2.getShape("Rectangle");
        shape4.draw();
    }
}
