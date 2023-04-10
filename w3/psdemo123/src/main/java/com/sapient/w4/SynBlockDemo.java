package com.sapient.w4;

public class SynBlockDemo implements Runnable{

    @Override
    public void run() {
        // Acquire lock on .class reference
        synchronized (SynBlockDemo.class)

        // ClassName is name of the class containing method.
        {
            {
                System.out.println(
                        Thread.currentThread().getName());

                System.out.println(
                        "in block "
                                + Thread.currentThread().getName());
                System.out.println(
                        "in block "
                                + Thread.currentThread().getName()
                                + " end");
            }
        }
    }
        // Method 2
        // Main driver method
        public static void main(String[] args){
            // Creating an object of above class
            // in the main() method
            SynBlockDemo g1 = new SynBlockDemo();

            // Creating an object of thread class i.e Thread
            // 1 where t1 takes g1 object
            Thread t1 = new Thread(g1);
            // Here, creating Thread 2 where t2 takes g1
            // object
            Thread t2 = new Thread(g1);

            // Creating another object of above class
            // in the main() method
            SynBlockDemo g2 = new SynBlockDemo();

            // Now Creating Thread 3 where t3 takes g2 object
            Thread t3 = new Thread(g2);

            // Giving custom names to above 3 threads
            // using the setName() method
            t1.setName("t1");
            t2.setName("t2");
            t3.setName("t3");

            // start() method is used to begin execution of
            // threads
            t1.start();
            t2.start();
            t3.start();
        }
}
