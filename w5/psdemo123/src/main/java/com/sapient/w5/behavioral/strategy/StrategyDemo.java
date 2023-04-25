package com.sapient.w5.behavioral.strategy;

public class StrategyDemo {
    public static void main(String [] args){
        Context context=new Context(new Addition());
        System.out.println("addition = "+ context.executeStrategy(1.2f,3.5f));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(1.2f, 2.1f));

    }
}
