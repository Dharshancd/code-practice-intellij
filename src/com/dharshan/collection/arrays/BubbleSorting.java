package com.dharshan.collection.arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {8, 22, 84, 11, 3, 55};
        BubbleSorting s = new BubbleSorting();
        s.sortAnArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        }

    public void sortAnArray(int[]arr){
        for (int i =0; i<arr.length;i++){
            for (int j =i+1; j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }

     }
  }
