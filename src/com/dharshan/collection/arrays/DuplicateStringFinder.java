package com.dharshan.collection.arrays;

public class DuplicateStringFinder {
    public static void main(String[] args) {
        String[] ary = {"abc","csc","adc","acf","hji","abc"};
        DuplicateStringFinder d = new DuplicateStringFinder();
        d.duplicateStringFinder(ary);
    }
    public void duplicateStringFinder(String[] ary) {
        for (int i = 0; i < ary.length; i++) {
            for (int j = i+1; j < ary.length; j++) {
                if ((ary[i].equals(ary[j])) && (i != j)) {
                    System.out.println(ary[i]);
                }
            }
        }
    }

}
