package com.sapient;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Boxing {
    public static void main(String[] args) {
        Object obj=new Object();
        ArrayList arrayList=new ArrayList();
        Stack stack = new Stack();
        Vector vector=new Vector();
        LinkedList linkedList=new LinkedList();
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        HashMap hashMap =new HashMap<>();
        HashSet hashSet = new HashSet();
        Queue queue=new PriorityQueue();
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();

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
