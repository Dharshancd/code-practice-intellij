package com.dharshan.arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {8, 22, 84, 11, 3, 55, 98};
        DuplicateRemover d = new DuplicateRemover();
        d.duplicateValueRemover(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        }
    public void duplicateValueRemover(int[]arr){
        for(int i =0; i<arr.length;i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i]=0;
                    // wrong
                }

            }

        }

    }
}
