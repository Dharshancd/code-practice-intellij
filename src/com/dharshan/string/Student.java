package com.dharshan.string;

class Student {
    String sname;
    int rollno;

    Student(String sname, int rollno) {
        this.sname = sname;
        this.rollno = rollno;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Name --> ").append(this.sname).append("   roll no --> ").append(this.rollno).toString();
    }

    public static void main(String[] args) {
        Student s = new Student("rattaiah", 100);
        System.out.println(s);//equal to //System.out.println(s.toString());com.dharshan.string.Student@13fdsfs
    }
}