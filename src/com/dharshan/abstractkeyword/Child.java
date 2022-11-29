package com.dharshan.abstractkeyword;

public class Child extends Parent {

    final int id;

    public Child(int id) {
        this.id = id;
    }

    public void sayHello(String name) {
        System.out.println("Hello from Child !! " + name );
        System.out.println(this.id);
    }
}
