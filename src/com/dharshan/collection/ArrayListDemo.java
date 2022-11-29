package com.dharshan.collection;

import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
//creation of ArrayList
        List<String> al = new ArrayList<>();
        System.out.println("initial size of the arraylist:" + al.size());
//adding elements to the ArrayList
        al.add("a");
        al.add("A");
        al.add("a");
        al.add(null);
        al.add(1, "ratan");
//print the ArrayList elements
        System.out.println(al);
        System.out.println("ArrayList size:" + al.size());
//remove the elements of ArrayList
        al.remove("a");
        System.out.println(al);

        System.out.println(al.remove(2));
        System.out.println(al);
        System.out.println("ArrayList size:" + al.size());

        System.out.println(al.get(1));

        System.out.println(al.indexOf("A"));

        System.out.println(al.contains("B"));

        Object[] arr = al.toArray();
        for (String a : al) {
            System.out.println(a);
//            al.remove("A");
        }

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        List<String> list = new ArrayList<>();
        list.add("Pavan");
        list.add("Dharshan");//new Integer(1);
        list.add("Sharath");


        String o = list.get(0);
        System.out.println(o);


    }
String str = new String("sdghgdhsjdgjkhg");
    String str2 = "sjkdfhjkgjsgdhjkgkjd";

}

