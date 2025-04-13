package com.gevernova.oops.inheritance.basicProblems.animalHierarchy;

public class AnimalHierarchy {
    public static void main(String[] args){
        Animal dog=new Dog("Rotwiller",10);
        dog.makeSound();
        Animal cat=new Cat("pet cat",4);
        cat.makeSound();
        Animal bird=new Bird("sparrow",5);
        bird.makeSound();


    }
}
