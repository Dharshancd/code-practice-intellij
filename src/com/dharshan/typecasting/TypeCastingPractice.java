package com.dharshan.typecasting;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingPractice {
    public static void main(String[] args) {
////        String  s = (String)getObj();
//        String s = "152a";
//        int j = Integer.parseInt(s);
//        System.out.println(j);
//
//        List<Object> o = getObj();
//
//        for(Object obj : o ) {
//
//            if(obj instanceof  String) {
//                System.out.println(((String) obj).length());
//            } else if(obj instanceof Integer) {
//                System.out.println(((Integer) obj).intValue());
//            }
//        }
//

        Animal a = (Animal) new Animal();
        Tiger t = (Tiger) new Tiger();
        Animal aa = (Animal) new Tiger();
//        Tiger tt = (Tiger)new Animal();//class cast exception
        Animal ani = getAnimalByType("tiger");
        ani.m1();
//        ani.m2();
        Tiger tiger = (Tiger)getAnimalByType("tiger");
        tiger.m1();
        tiger.m2();



    }

    private static Animal getAnimalByType(String type) {
        if("tiger".equals(type) ) {
            return new Tiger();
        } else {
            return new Lion();
        }
    }
}



class Animal {

//    String color;

    public void m1() {
        System.out.println("animal m1");
    }

}

class Tiger extends Animal
{

@Override
    public void m1() {
        System.out.println("Tiger m1");
    }

    public void m2() {
        System.out.println("Tiger m2");
    }
}

class Lion extends Animal
{

    @Override
    public void m1() {
        System.out.println("Lion m1");
    }

    public void m2() {
        System.out.println("Lion m2");
    }
}


class Employee {

}