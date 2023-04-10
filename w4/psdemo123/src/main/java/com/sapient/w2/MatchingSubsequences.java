package com.sapient.w2;

import java.util.HashMap;
import java.util.Map;

//Given a string s and an array of strings words,
// return the number of words[i] that is a subsequence of s.
public class MatchingSubsequences {
    public static int numMatchingSubSeq(String s, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int ans = 0;
        char [] ch = s.toCharArray();

        for(String str:map.keySet()){
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            while(i<ch.length && j<temp.length){
                if(ch[i]==temp[j]){
                    i++;    j++;
                }else{
                    i++;
                }
            }
            if(j==temp.length){
                ans+=map.get(str);
            }
        }
        return ans;
    }

    public static void main(String [] args){
        String s1="rrysrkul";
        String[] seq1= {"sku","ru","rty"};
        System.out.println(numMatchingSubSeq(s1,seq1));
    }
}
