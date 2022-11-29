package com.dharshan.wrapperclass;

public class WrapperPractice {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer i2 = new Integer("10");
        System.out.println(i);
        System.out.println(i2);
        int j = 10;
        Integer i3 = Integer.valueOf(j);
        int k = i3.intValue();
        System.out.println(i3);

        Integer x = Integer.parseInt("250");
        System.out.println(x);
        Integer y = Integer.valueOf(25);
        int z = printInt(y);
    }


    public static Integer printInt(int i) {
        System.out.println(i);
        return i*i;
    }



}
