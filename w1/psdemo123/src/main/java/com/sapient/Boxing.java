package com.sapient;

public class Boxing {
    public static void main(String[] args) {

        // Creating an Integer Object with custom value say it be 10
        Integer i = new Integer(10);

        // Unboxing the Object
        int i1 = i;

        // Print statements
        System.out.println("Value of boxed integer:" + i);
        System.out.println("Value of un-boxed integer: " + i1);

        // Autoboxing of character
        Character character = 'a';

        // Auto-unboxing of Character
        char ch = character;

        // Print statements
        System.out.println("Value of unboxed ch: " + ch);
        System.out.println("Value of boxed character: " + character);
    }
}
