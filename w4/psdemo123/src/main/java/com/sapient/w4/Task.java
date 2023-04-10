package com.sapient.w4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{

    private String name;

    public Task(String s)
    {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    @Override
    public void run() {
        try {
            for (int i = 0; i<=5; i++) {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                if (i==0) {
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d));
                    //prints the initialization time for every task
                } else {
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" complete");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
