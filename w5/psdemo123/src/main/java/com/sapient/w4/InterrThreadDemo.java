package com.sapient.w4;

public class InterrThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        InterrThread thread = new InterrThread();
        thread.start();

        // main thread calls interrupt() method on
        // child thread
        thread.interrupt();

        System.out.println("Main thread execution completes");
    }
}
