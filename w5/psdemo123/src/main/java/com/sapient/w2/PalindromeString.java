package com.sapient.w2;

import java.util.Arrays;

public class PalindromeString {
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    static boolean isPalindromeUsingHalfLoop(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "Tata";
        System.out.println(isPalindrome(str.toLowerCase()));
        System.out.println(isPalindromeUsingHalfLoop(str.toLowerCase()));
    }
}
