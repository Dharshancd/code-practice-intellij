package com.dharshan.collection.arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 82, 95, 73, 85, 82,};
        SecondLargestNumber d = new SecondLargestNumber();
        int m=d.secondLargestNumber(arr);
        System.out.println(m);
    }
    public int secondLargestNumber(int[]arr){
        int max= 0;
        int max2=0;
        for(int i=0; i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if((max2<max)&&(max2>arr[i])){
                    max2=arr[i];

            }
            }
           return  max2;
        }
    }

