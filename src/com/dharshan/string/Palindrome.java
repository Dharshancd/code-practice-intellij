package com.dharshan.string;

import java.util.ArrayList;
public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        Palindrome b = new Palindrome();
        boolean v = b.palindromevalueFinder(str);
        System.out.println(v);

    }

    public boolean palindromevalueFinder(String str) {
        int i = 0;
        while (i < str.length()/2 + 1) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
            i++;

        }
        return true;

    }


    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2 + 1; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
