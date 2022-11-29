package com.dharshan.collection.arrays;

public class AvgCalculator {
    public static void main(String[] args) {
        int[] arr = {88, 82, 95, 73, 85, 82};
        AvgCalculator v = new AvgCalculator();
        int n = v.avgFinder(arr);
        System.out.println(n);
    }

    public int avgFinder(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        System.out.println(sum);
        return avg;
    }
}