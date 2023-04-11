package com.sapient.w4streams;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String args[])
    {

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
