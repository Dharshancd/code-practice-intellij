package com.dharshan.superkeyword;

public class Parent {
    private int id ;

    public Parent(int id) {this.id =id;}

    public Parent() {}
    public void sayHello(String name) {
        System.out.println("Hi from parent !! " + name );
    }

    public void sayHi(String name) {
        System.out.println("Hi from parent !! " + name );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
