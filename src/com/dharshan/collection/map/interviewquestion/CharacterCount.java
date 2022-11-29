package com.dharshan.collection.map.interviewquestion;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        Map<Character, Integer> map = countCharacter("jflkajslkfdjlsajldfkjlksjfsjfjsjafjlsjlfjlaslfd");
        System.out.println(map);
        char maxChar = ' ';
        int maxCount = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> e:map.entrySet()) {
            if(e.getValue() > maxCount) {
                maxChar = e.getKey();
                maxCount = e.getValue();
            }
        }
        System.out.println(maxChar);
    }


    private static Map<Character, Integer> countCharacter(String s) {

        Map<Character, Integer> temp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(temp.containsKey(s.charAt(i))) {
                int cur = temp.get(s.charAt(i));
                temp.put(s.charAt(i), cur + 1);
            } else {
                temp.put(s.charAt(i), 1);
            }
        }
        return temp;
    }
}
