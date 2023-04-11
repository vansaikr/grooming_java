package com.sapient.w4streams;

public class LambdaEx{
    public static void main(String [] arg){
        Thread t=new Thread(()->{System.out.println("new thread");});
        t.start();
        System.out.println("main thread");
    }

}
