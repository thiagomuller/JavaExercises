package com.thiagomuller;

public class UsingTreeSet implements Comparable<UsingTreeSet>{
    private String name;
    private int age;

    public UsingTreeSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(UsingTreeSet person) {
        if(this.getAge() > person.getAge()){
            return 1;
        } else if(this.getAge() < person.getAge()){
            return -1;
        } else{
            return 0;
        }
    }
}
