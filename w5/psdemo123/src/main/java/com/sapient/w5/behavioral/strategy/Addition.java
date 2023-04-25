package com.sapient.w5.behavioral.strategy;

public class Addition implements Strategy{

    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
