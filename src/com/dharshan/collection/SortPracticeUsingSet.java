package com.dharshan.collection;

import java.util.*;

public class SortPracticeUsingSet{
public static void main(String[]args){
    List<Character> characters = List.of('A','Z','A','B','Z','F');
    Set<Character> ts= new TreeSet<>(characters);
    System.out.println("TreeSet " +ts);

    Set<Character> lhs= new LinkedHashSet<>(characters);
    System.out.println("LinkedHashSet " +lhs);

    Set<Character> hs= new HashSet<>(characters);
    System.out.println("HashSet " +hs); // It is not sorted
    }

 }
