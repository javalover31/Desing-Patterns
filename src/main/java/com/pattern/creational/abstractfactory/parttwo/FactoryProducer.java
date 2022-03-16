package com.pattern.creational.abstractfactory.parttwo;

import com.pattern.creational.abstractfactory.partone.AbstractFactory;
import com.pattern.creational.abstractfactory.partone.RoundShapeFactory;
import com.pattern.creational.abstractfactory.partone.ShapeFactory;

public class FactoryProducer {
    AbstractFactory getFactory(boolean roundType){
         if (roundType)
             return new RoundShapeFactory();
         else
             return new ShapeFactory();
    }
}
