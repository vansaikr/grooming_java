package com.sapient;

public class Ordinal {
    public static void main(String args[]) {
        System.out.println("Student Name:");
        for(Color m : Color.values()) {
            System.out.println(m+" : "+m.ordinal()+" ");
        }
    }
}
