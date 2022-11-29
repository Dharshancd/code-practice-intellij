package com.dharshan.collection.list;

import java.util.List;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Pavan");
        s.push("Dharshan");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
    }
}
