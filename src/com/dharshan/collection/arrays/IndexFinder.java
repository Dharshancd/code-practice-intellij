package com.dharshan.collection.arrays;

public class IndexFinder {
    public static void main(String[] args) {
        int[] arr = {8, 22, 84, 11, 3, 55};

        IndexFinder f = new IndexFinder();
        int v = f.indexSerch(arr, 55);
        System.out.println(v);
        f.reverseAnArray(arr);
    }
    public int indexSerch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public void reverseAnArray(int[]arr){
        for(int i=arr.length-1; i>=0;i--){
        System.out.print(arr[i]+" ");
            }

         }
    }
