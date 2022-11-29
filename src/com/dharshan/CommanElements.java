package com.dharshan;

public class CommanElements {
    public static void main(String[] args) {
        int[] ary1 = {11, 22, 38, 24, 35, 41,5,7};
        int[] ary2 = {18, 22, 28, 24, 35, 61,5,7};
        CommanElements e = new CommanElements();
        int [] result = e.commanElementsFinder(ary1,ary2);
        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0){
                System.out.println(result[i]);
            }
        }
    }

    public  int[] commanElementsFinder(int[] ary1, int[] ary2) {
        int[] temp = new int[ary1.length];
        int k=0;
     for(int i=0; i<ary1.length; i++){
         for(int j=0; j< ary2.length; j++){
             if (ary1[i]==ary2[j] ){
                 temp[k] = ary1[i];
                 k++;
             }
         }
     }
return temp;
    }

}