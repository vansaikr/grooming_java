package com.sapient.w4;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {

        ThreadPriority thp1 = new ThreadPriority();
        thp1.setPriority(MAX_PRIORITY);
        thp1.setName("tp1");
        thp1.start();

        ThreadPriority thp2 = new ThreadPriority();
        thp2.setPriority(MIN_PRIORITY);
        thp2.setName("tp2");
        thp2.start();
    }
    public void run(){
        System.out.println("Thread name is " + currentThread().getName());
    }
}
