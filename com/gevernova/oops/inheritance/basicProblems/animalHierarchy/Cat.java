package com.gevernova.oops.inheritance.basicProblems.animalHierarchy;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" does meo meo");
    }

}
