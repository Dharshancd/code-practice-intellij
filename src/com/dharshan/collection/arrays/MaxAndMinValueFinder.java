package com.dharshan.collection.arrays;
public class MaxAndMinValueFinder {
    public static void main(String[] args) {
        int[] arr = {8, 22, 84, 11, 3, 55,98};
        MaxAndMinValueFinder m = new MaxAndMinValueFinder();
        int d = m.maxValue(arr);
        System.out.println(d);

        int e = m.minValue(arr);
        System.out.println(e);
    }
    public int maxValue(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        return max;
    }
    public int minValue(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min= arr[i];
            }
        }
        return min;
    }
}