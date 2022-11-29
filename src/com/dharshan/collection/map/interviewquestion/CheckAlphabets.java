package com.dharshan.collection.map.interviewquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckAlphabets {

    public static void main(String[] args) {
      System.out.println(checkAlpha("fsdfsdfewrfhfgndojfewjroewnfsdhoifjpdawjrlkekwnnfoisdahofnwenfhsdoijfwenfnsoadfoisdkfnksjdjbfhxpjfvslc,mqtuyz"));
    }

    private static boolean checkAlpha(String s) {
        String aphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] split = aphabets.split("");
        System.out.println(Arrays.asList(split));
        Set<String> set = new HashSet<>(Arrays.asList(split));
        System.out.println(set);
        for (int i = 0; i < s.length(); i++) {
            if(set.isEmpty()) {
                return true;
            }
            set.remove(String.valueOf(s.charAt(i)));
            System.out.println(set);
        }
        return set.isEmpty();

    }
}
