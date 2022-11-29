package com.dharshan.collection.list;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id,String name) {
        super();
        this.id = id;
        this.name=name;
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
    public String toString() {
        return id+" "+name;
    }

    @Override
    public int compareTo(Student that) {
        int temp = Integer.compare(this.id,that.id);
        if(temp != 0) {
            return temp;
        }
        temp = this.name.compareTo(that.name);
        return temp;

    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

