package com.sapient.w4streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String [] arg){
        ArrayList<Integer> al=new ArrayList();
        al.add(67);
        al.add(12);
        al.add(34);
        al.add(67);
        al.add(45);
        al.add(78);

        al.stream().forEach((a)->System.out.print(a+" "));
        System.out.println(al.stream().skip(3).collect(Collectors.toSet()));
        System.out.println(al.stream().distinct().count());
        al.stream().sorted().forEach(a->System.out.print(a+" "));
        List<Integer> newar=al.stream().map(i -> (i>50)?i+6:i-6).collect(Collectors.toList());
        System.out.println(newar);
        System.out.println(al.stream().filter(i -> i % 2 == 0).filter(i->(i<50)).anyMatch(i->(i>25)));
    }
}
