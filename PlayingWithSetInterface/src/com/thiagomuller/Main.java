package com.thiagomuller;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Immutable classes are classes defined final, with all its fields final as well, with only getters:
        Immutable immutable = new Immutable("Thiago" , 28);
        Immutable secondImmutable = new Immutable("Paty" , 26);
        Immutable thirdImmutable = new Immutable("Nih" , 30);
        Immutable forthImmutable = new Immutable("Anne" , 29);
        //The set interface is implemented by classes such as HashSet, LinkedHashSet and TreeSet
        //These data structures are lists that accepts only one element each, it doesn't accept duplicates
        Set<Immutable> persons = new HashSet<>();
        persons.add(immutable);
        persons.add(secondImmutable);
        persons.add(thirdImmutable);
        persons.add(forthImmutable);
//        persons.forEach(person -> {
//            System.out.println("Name is: " + person.getName() + ", and age is: " + person.getAge());
//        });

        UsingTreeSet usingTreeSet = new UsingTreeSet("Thiago" , 28);
        UsingTreeSet secondUsingTreeSet = new UsingTreeSet("Paty" , 26);
        UsingTreeSet thirdUsingTreeSet = new UsingTreeSet("Nih" , 30);
        UsingTreeSet forthUsingTreeSet = new UsingTreeSet("Anne" , 29);

        Set<UsingTreeSet> treeSetPersons = new TreeSet<>();
        treeSetPersons.add(usingTreeSet);
        treeSetPersons.add(secondUsingTreeSet);
        treeSetPersons.add(thirdUsingTreeSet);
        treeSetPersons.add(forthUsingTreeSet);

//        treeSetPersons.forEach(person -> {
//            System.out.println("Name is: " + person.getName() + ", and age is; " + person.getAge());
//        });

        //Playing with symmetric difference between two sets:
        Set<Integer> firstNums = new HashSet<>();
        firstNums.add(1);
        firstNums.add(2);
        firstNums.add(3);
        firstNums.add(4);

        Set<Integer> secondNums = new HashSet<>();
        secondNums.add(3);
        secondNums.add(4);
        secondNums.add(5);
        secondNums.add(6);
        secondNums.add(7);

        Set<Integer> intersection = new HashSet<>(firstNums);
        intersection.retainAll(secondNums);

        Set<Integer> allNums = new HashSet<>(firstNums);
        allNums.addAll(secondNums);

        allNums.removeAll(intersection);

        allNums.forEach(num -> {
            System.out.println(num);
        });
    }
}
