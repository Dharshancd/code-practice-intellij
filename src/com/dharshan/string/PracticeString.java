package com.dharshan.string;

public class PracticeString {
    public static void main(String[] args) {
        System.out.println("Pavan"=="Pavan");

        String s = "Pavan";
        System.out.println(s == "Pavan");
        char [] c = {'p', 'a', 'v', 'a', 'n'};
        s = new String(c, 1, 3);
        System.out.println(s);
        System.out.println(s.equals("pavan"));
        System.out.println(s.equalsIgnoreCase("pavan"));

        byte[] b={65,66,67,68,69,70};

        s = new String(b);
        System.out.println(s);

    }
}
