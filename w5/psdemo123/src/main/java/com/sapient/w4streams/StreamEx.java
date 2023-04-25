package com.sapient.w4streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    //given a number k and count n, find the double of n
    //even numbers starting with k, where sqrt of each number is > 20
    public static int magicNum(int k, int n){
        return Stream.iterate(k,e->e+1)
                .filter(e->e%2==0)
                .filter((e->Math.sqrt(e)>20))
                .mapToInt(e->e*2)
                .limit(n)
                .sum();
    }
    public static void main(String [] arg){
        ArrayList<Integer> al=new ArrayList();
        al.add(67);
        al.add(12);
        al.add(34);
        al.add(67);
        al.add(45);
        al.add(78);

        al.stream()
                .forEach((a)->System.out.print(a+" "));

        System.out.println(
                al.stream()
                .skip(3)
                .collect(Collectors.toSet()));

        System.out.println(
                al.stream()
                .distinct()
                .count());

        al.stream()
                .sorted()
                .forEach(a->System.out.print(a+" "));

        List<Integer> newar=al.stream()
                .map(i -> (i>50)?i+6:i-6)
                .collect(Collectors.toList());

        System.out.println(
                newar);

        System.out.println(
                al.stream()
                .filter(i -> i % 2 == 0)
                .filter(i->(i<50))
                .anyMatch(i->(i>25)));

        System.out.println(
                al.stream()
                .reduce(0,(a,total)->Integer.sum(a,total)));

        System.out.println(
                al.stream()
                .reduce(0,Integer::sum));

        System.out.println(
                al.stream()
                .map(String::valueOf)
                .reduce("",(a,b)->a.concat(b)));

        System.out.println(
                al.stream()
                .map(String::valueOf)
                .reduce("",(a,b)->b.concat(a)));

        System.out.println(
                al.stream()
                .map(String::valueOf)
                .reduce("",String::concat));

        //output the double the sum of even numbers
        System.out.println(
                al.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .reduce(0,Integer::sum));

        Timeit.code(()->
        System.out.println(
                al.stream()
                .filter(i->i%2==0)
                .mapToInt(i->i*2)
                .sum()));

        //infinite streams
        System.out.println(Stream.iterate(100,e->e+1));

        System.out.println(magicNum(22,68));



    }
}
