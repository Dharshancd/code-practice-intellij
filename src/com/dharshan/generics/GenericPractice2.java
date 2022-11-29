package com.dharshan.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericPractice2 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        print2(l);

        List<Object> l2 = new ArrayList<>();
        l2.add(new Object());
        l2.add(new Object());
        print2(l);

        List<Double> d = new ArrayList<>();
        d.add(1.2);
        d.add(4.5);
//        print2(d);



    }


    private static void print(List<? extends Number> list){
        System.out.println(list);
        Number o = list.get(0);
//        o.
    }

    private static void print2(List<? super Integer> list){
        System.out.println(list);

        Object object = list.get(0);
//        Number o = list.get(0);
//        o.
    }

}

class A {

}

class B extends A{

}

class C {}

