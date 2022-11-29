package com.dharshan.generics;

public class GenericsPractice {
    public static void main(String[] args) {

        MyClass<Integer> c1 = new MyClass<>(10);
        c1.print();
        c1.setT(50);
        c1.print();

        MyClass<String> c2 = new MyClass<>("Pavan");
        c2.print();
        c2.setT("Dharshsan");
        c2.print();


        MyClass2 c3 = new MyClass2();
        c3.print("String");
        c3.print(1);

    }
}



class MyClass<T> {
    private T t;

    public MyClass(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void print(){
        System.out.println(this.t);
    }
}


class MyClass2 {

    public <T> T print(T t){
        System.out.println(t);
        return t;
    }


}