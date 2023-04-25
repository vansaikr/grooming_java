package com.sapient.w2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class AnagramString {
     static boolean anagram1(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.toString(c1).equals(Arrays.toString(c2))){
            return true;
        };
        return false;
    }

    public static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i),
                        map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] arg){
        String s1="abcde";
        String s2="abdec";
        System.out.println(anagram1(s1,s2));
        System.out.println(isAnagram(s1,s2));
    }
}
