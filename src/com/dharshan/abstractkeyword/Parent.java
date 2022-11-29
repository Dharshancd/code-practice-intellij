package com.dharshan.abstractkeyword;

abstract public class Parent {
    int id;
    abstract public void sayHello(String name);

    public void sayHi(String name) {
        System.out.println("Hi from parent !! " + name );
    }

}
