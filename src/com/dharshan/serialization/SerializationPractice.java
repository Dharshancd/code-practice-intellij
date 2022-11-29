package com.dharshan.serialization;

import java.io.*;

public class SerializationPractice {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Employee e = new Employee(1, "Dharshan", "123456");
//        Employee.setCompany("TCS");
//
//        FileOutputStream fo = new FileOutputStream("myobj");
//        ObjectOutputStream oo = new ObjectOutputStream(fo);
//        oo.writeObject(e);
//
//        oo.close();

        FileInputStream fi = new FileInputStream("myobj");
        ObjectInputStream oi = new ObjectInputStream(fi);
        Object o = oi.readObject();
        System.out.println(o);
        System.out.println("Object DeSerialized");



    }
}


class Employee implements Serializable {

//    private static final long serialVersionUID = 123465465L;
    private int id;
//    private String name;
    private transient String password;
    private static String company;

    public Employee() {
    }

    public Employee(int id,
//                    String name,
                    String password) {
        this.id = id;
//        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
//                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", company='" + company + '\''+
                '}';
    }
}
