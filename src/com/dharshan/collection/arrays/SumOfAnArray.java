package com.dharshan.collection.arrays;

public class SumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {8, 22, 84, 11, 3, 55};
        SumOfAnArray s = new SumOfAnArray();
        int n = s.sum(arr);
        System.out.println(n);
    }
    public int sum(int[]arr){
        int sum=0;
        for (int i:arr){
        sum+=i;
        }
        return sum;
      }
    }