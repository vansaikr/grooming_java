package com.sapient.w4;

// Java Program to Illustrate ThreadLocal Class
// Via get() and set() Method

// Class
// ThreadLocalDemo
public class ThreadLocalDemo {
    public static void main(String[] args) {
        
        // Creating objects of ThreadLocal class
        ThreadLocal<Number> demo1 = new ThreadLocal<>();
        ThreadLocal<String> demo2 = new ThreadLocal<>();

        // Now setting custom value
        demo1.set(100);

        // Returns the current thread's value
        System.out.println("value = " + demo1.get());
        System.out.println("hashcode = " + demo1.hashCode());
        // Setting the value
        demo1.set(90);

        // Returns the current thread's value of

        System.out.println("value = " + demo1.get());
        System.out.println("hashcode = " + demo1.hashCode());
        // Setting the value
        demo1.set(88.45);

        // Returns the current thread's value of
        System.out.println("value = " + demo1.get());
        System.out.println("hashcode = " + demo1.hashCode());

        System.out.println("value = " + demo2.get());
        // Setting the value
        demo2.set("threadLocal");

        // Returning the current thread's value of
        System.out.println("value = " + demo2.get());
        System.out.println("hashcode = " + demo2.hashCode());
    }
}

