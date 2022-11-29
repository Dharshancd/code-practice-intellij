package com.dharshan.collection.arrays;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class ListComparable {

    public static void main(String[] args) {
//        Employee[]  arr = new Employee[3];
        Employee e1 = new Employee(2, "Dharshan");
        Employee e2 = new Employee(1, "Pavan");
        Employee e3 = new Employee(1, "Sunil");
        Employee[]  arr = {e1, e2, e3};
//
//        System.out.println(e1.compareTo(e2));
//        System.out.println(e2.compareTo(e1));
//        arr[0] = e1;
//        arr[1] = e2;
//        arr[2] = e3;



        Arrays.sort(arr, new SortById());

        System.out.println(Arrays.asList(arr));



    }




}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getId() > o2.getId()) {
            return +1;
        } else if (o1.getId()<o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}



class Employee {
    private int id;
    private String name;

    int salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
//
//    @Override
//    public int compareTo(Employee o) {
//        if(this.id > o.id) {
//            return +1;
//        } else if (this.id<o.id) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}