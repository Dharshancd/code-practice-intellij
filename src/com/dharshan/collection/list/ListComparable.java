package com.dharshan.collection.list;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparable {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(2, "Dharshan");
        Employee e2 = new Employee(1, "Pavan");
//
//        System.out.println(e1.compareTo(e2));
//        System.out.println(e2.compareTo(e1));

        list.add(e1);
        list.add(new Employee(5, "Prasad"));
        list.add(new Employee(3, "Sunil"));
        list.add(e2);
        list.add(new Employee(4, "Sharath"));

//        System.out.println(list);

        Comparator<Employee> c = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(list, c);
//        String temp = "name";
//        if(temp.equals("id")) {
//            Collections.sort(list, new SortById());
//        } else if (temp.equals("name")) {
//            Collections.sort(list, new SortByName());
//        }

        System.out.println(list);

//        Employee e3 = new Employee(2, "xxx");
//        Class<Employee> clazz = (Class<Employee>)e3.getClass();
//        System.out.println(clazz.getName());
//        Method[] methods = clazz.getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i].getName());
//        }
//
//        Field[] fields = clazz.getDeclaredFields();
//        for (int i = 0; i < fields.length; i++) {
//            System.out.println(fields[i].getName());
//        }

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