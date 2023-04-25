package com.sapient.w5.behavioral.command;

public class CommandDemo {
    public static void main(String [] args) throws InterruptedException {
        Light light=new Light();
        light.on();
        Thread.sleep(1000);
        light.off();
    }
}
