package com.dharshan.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfMultipelList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(8,9,10));
        list.add(Arrays.asList(5,6,7));
//        System.out.println(list);
//        System.out.println(list.get(0));
        SumOfMultipelList a = new SumOfMultipelList();
        int b = a.add( list);
        System.out.println(b);
    }
public int add(List<List<Integer>> list){
        int sum =0;

//        for(int i=list.get(0); i<list.size(); i++) {
//            sum += i;
//        }
///// [[[1, 2, 3], [8, 9, 10]],[[1, 2, 3], [8, 9, 10]]]
    for (List<Integer> outerList:list) {
        for (Integer i :outerList) {
            sum += i;

        }
    }



    return sum;
}

}




