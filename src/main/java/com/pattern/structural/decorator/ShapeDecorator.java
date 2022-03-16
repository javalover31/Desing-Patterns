package com.pattern.structural.decorator;

public abstract class ShapeDecorator {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    abstract void draw();
}
