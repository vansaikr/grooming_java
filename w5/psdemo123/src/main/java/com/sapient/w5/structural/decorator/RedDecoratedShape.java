package com.sapient.w5.structural.decorator;

public class RedDecoratedShape extends ShapeDecorator{
    public RedDecoratedShape (Shape decoratedShape){
        super(decoratedShape);
    }

    @Override public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
