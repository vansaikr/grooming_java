package com.sapient;

public class Main {
    public static int sum(int a, int b){
        System.out.print(a+""+b);
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(sum(1,2),3));
    }
}