package com.gevernova.oops.inheritance.basicProblems.animalHierarchy;

public class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    void  makeSound(){
        System.out.println("Makes Sound");
    }

}
