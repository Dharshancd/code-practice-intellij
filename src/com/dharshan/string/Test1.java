package com.dharshan.string;

class Test1 implements Cloneable {
    int a = 10;
    int b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 t1 = new Test1();
        Test1 t2 = (Test1) t1.clone();
        t1.a = 100;
        t1.b = 200;
        System.out.println(t1.a + "----" + t1.b);
        System.out.println(t2.a + "----" + t2.b);
    }
}