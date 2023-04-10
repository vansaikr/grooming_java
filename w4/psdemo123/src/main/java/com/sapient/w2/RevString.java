package com.sapient.w2;

public class RevString {

    public static String revString1(String s){
        for(int i=0;i<(s.length()-1)/2;i++) {
            s = s.substring(0, i) + s.charAt(s.length() - 1 - i) + s.substring(i + 1, s.length() - 1 - i) + s.charAt(i) + s.substring(s.length() - i);
        }
        return s;
    }

    public static String revString2(String s){
        for(int i=0;i<(s.length()-1);i++) {
            s = s.substring(0,i) + s.charAt(s.length()-1) + s.substring(i,s.length()-1);
        }
        return s;
    }
    public static void main(String[] args) {
        String s="0123456789";
        System.out.println(revString1(s));
        System.out.println(revString2(s));
    }
}
