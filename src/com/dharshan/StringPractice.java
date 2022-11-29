package com.dharshan;

import java.security.SecureRandom;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Dha";
        String str2 = new String("Dha");
        String str3 = "Dha";
        StringPractice s = new StringPractice();
        boolean b = s.check(str1,str2);
       System.out.println(b);
//
//        boolean c = s.check(str1,str3);
//        System.out.println(c);
    }

    public  boolean check(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}