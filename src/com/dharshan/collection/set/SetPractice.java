package com.dharshan.collection.set;

import com.dharshan.collection.list.Student;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
        Set<Student> s = new TreeSet<>();

        s.add(new Student(10, "Pavan"));
        s.add(new Student(40, "Prasand"));
        s.add(new Student(20, "Dharshan"));
        s.add(new Student(50, "Sunil"));
        s.add(new Student(30, "Sharath"));
        s.add(new Student(10, "Pavan"));
        s.add(new Student(10, "Cd"));
        System.out.println(s);

        for (Student ss:s) {
            System.out.println(ss);
        }

        Iterator<Student> iterator = s.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
