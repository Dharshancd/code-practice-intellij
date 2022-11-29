package com.dharshan.collection.map;

import com.dharshan.collection.list.Student;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {
        Map<Integer, Student> m = new Hashtable<>();
        m.put(1, new Student(1, "Pavan"));
        m.put(2, new Student(2, "Dharashan"));
        m.put(5, new Student(3, "Madhu"));
        m.put( 3, new Student(1, "Sharant"));

        System.out.println(m);
        Map<Integer, Student> lm = new LinkedHashMap<>();
        lm.put(1, new Student(1, "Pavan"));
        lm.put(2, new Student(2, "Dharashan"));
        lm.put(5, new Student(3, "Madhu"));
        lm.put( 3, new Student(1, "Sharant"));


        System.out.println(lm);

        Map<Integer, Student> tm = new TreeMap<>(m);

        System.out.println(tm);

        for (Map.Entry<Integer, Student> e: m.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        m.put(1, new Student(5,"Sunil"));


        for (Student s : m.values()) {
            System.out.println(s);
        }

        for (Integer i: m.keySet()) {
            System.out.println(m.get(i));
        }


    }
}






