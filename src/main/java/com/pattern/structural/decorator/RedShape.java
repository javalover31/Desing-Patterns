package com.pattern.structural.decorator;

public class RedShape extends ShapeDecorator{
    public RedShape(Shape shape) {
        super(shape);
    }

    @Override
    void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape decoratedShape)
    {
        // Display message whenever function is called
        System.out.println("Border Color: Red");
        System.out.println();
    }
}
