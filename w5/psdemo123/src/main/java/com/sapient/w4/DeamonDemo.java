package com.sapient.w4;

public class DeamonDemo extends Thread{
    public DeamonDemo(String t1) {
        super(t1);
    }

    public static boolean checkIfDeamon(Thread t){
        if(t.isDaemon()==true)
            return true;
        return false;
    }

    public void run(){
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread");
        }else{
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args)
    {

        DeamonDemo t1 = new DeamonDemo("t1");
        DeamonDemo t2 = new DeamonDemo("t2");
        DeamonDemo t3 = new DeamonDemo("t3");

        // Setting user thread t1 to Daemon
        t1.setDaemon(true);

        // starting first 2 threads
        t1.start();
        t2.start();

        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();

        System.out.println("t1 is deamon: "+checkIfDeamon(t1));
    }
}
