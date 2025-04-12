package com.gevernova.constructors.accessmodifiers.universityManagment;

public class UniversityManagementSystem {
    public static void main(String[] args){
        PostgraduateStudent pg = new PostgraduateStudent(9.2, 101, "Krethik");

        System.out.println("Before name change:");
        pg.display();

        pg.changeName(" Krethik Yadav");

        System.out.println("\nAfter name change:");
        pg.display();

    }
}
