package com.sapient.w2;
//You are given a string s consisting only of letters 'a' and 'b'.
// In a single step you can remove one palindromic subsequence from s.
//Return the minimum number of steps to make the given string empty.
public class RemovePalindromeSub {
    //If string is a palindrome: return 1
    //Else return 2
    static int numberOfTimesToRemovePalindromeSub(String s){
        if(s==""){
            return 0;
        } else if (PalindromeString.isPalindrome(s)) {
            return 1;
        }else {
            return 2;
        }
    }
    public static void main(String [] arg){
        String s="";
        System.out.println(numberOfTimesToRemovePalindromeSub(s));
    }

}
