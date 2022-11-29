package com.dharshan.collection.arrays;

public class DuplicateValueFinder {
    public static void main(String[] args) {
        int[] arr = {88, 82, 95, 73, 85, 82};
        DuplicateValueFinder d = new DuplicateValueFinder();
        d.duplicateValueFinder(arr);

    }
    public void duplicateValueFinder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}