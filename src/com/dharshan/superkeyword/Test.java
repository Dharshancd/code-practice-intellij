package com.dharshan.superkeyword;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child(10 ,"Pavan");

        p.sayHello("Pavan");
        p.sayHi("Dharshan");
        System.out.println(p.getId());

    }
}
