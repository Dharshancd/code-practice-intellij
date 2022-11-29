package com.dharshan.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("a");
        al.add("c");
        al.add("a");
        al.add("d");

        System.out.println(al);

        Iterator<String> itr = al.iterator();
            //Iteration
//        while (itr.hasNext()) {
//            String temp = itr.next();
//            if(temp.equals("a")) {
//                itr.remove();
//            }
//        }
//        System.out.println(al);


        //sorting

        Collections.sort(al);
        System.out.println(al);
    }
}
