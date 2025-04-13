package com.gevernova.oops.inheritance.basicProblems.animalHierarchy;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println(name+" makes chirp chirp");
    }
}
