package com.dharshan.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class AnnotationPractice {

    public static void main(String[] args) {
        Test t = new Test();
//        Class<Test> clazz = (Class<Test>) t.getClass();
        Class<Test> clazz = Test.class;
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation a :annotations) {
            System.out.println(a.getClass().getName());
//            Field[] declaredFields = a.getClass().getDeclaredFields();
//            Field f = declaredFields[0];
//            System.out.println(f.getName());
//            System.out.println(f.getType());

            if(a instanceof MyAnnotation){
                MyAnnotation aaa = (MyAnnotation) a;
                System.out.println(aaa.value());
                System.out.println((aaa).color());

            }
        }
    }
}


@MyAnnotation(value="Pavan", color=COLOR.RED)
class Test {

    public void m1() {
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnnotation {
    String value();
    COLOR color();

}


enum COLOR {
    RED, BLUE, YELLOW, BLACK, WHITE;
}