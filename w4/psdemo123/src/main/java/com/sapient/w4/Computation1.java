package com.sapient.w4;

import java.util.concurrent.BrokenBarrierException;

public class Computation1 implements Runnable{
    public static int product = 0;
    public void run()
    {
        product = 2 * 3;
        try
        {
            CyclicBarrierDemo.newBarrier.await();
        }
        catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }
    }
}
