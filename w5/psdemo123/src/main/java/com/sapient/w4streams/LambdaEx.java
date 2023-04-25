package com.sapient.w4streams;

import java.util.Arrays;
import java.util.List;

public class LambdaEx{
    public static void main(String [] arg){
        Thread t=new Thread(()->{System.out.println("new thread");});
        t.start();
        System.out.println("main thread");

        List<Integer> ls= Arrays.asList(1,2,3,4,5,6);

        ls.forEach(e->System.out.println(e));

        //method as a parameter
        ls.forEach(System.out::println);

        //static method as parameter
        ls.stream().map(String::valueOf).forEach(System.out::print);

        //parameter as target
        ls.stream().map(e->String.valueOf(e)).map(String::toString).forEach(System.out::println);
    }

}
