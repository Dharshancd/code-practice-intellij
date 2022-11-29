package com.dharshan.superkeyword;

public class Child extends Parent {

    private String name;

    public Child(int id, String name) {

        this.name = name;

    }

    public Child() {
        super();
    }


    public void sayHello(String name) {
        System.out.println("Hello from Child !! " + name );
    }
}
