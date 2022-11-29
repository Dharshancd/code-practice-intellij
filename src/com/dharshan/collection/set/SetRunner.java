package com.dharshan.collection.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','A','B','Z','F');
        Set<Character> treeSet = new TreeSet<>(characters);
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
//        treeSet.add('A');
//        treeSet.add('Z');
//        treeSet.add('A');
//        treeSet.add('B');
//        treeSet.add('Z');
//        treeSet.add('F');

        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }
}