package com.gevernova.constructors.accessmodifiers.universityManagment;

public class UniversityManagementSystem {
    public static void main(String[] args){
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(9.2, 101, "Krethik");

        System.out.println("Before name change:");
        postgraduateStudent.display();

        postgraduateStudent.changeName(" Krethik Yadav");

        System.out.println("\nAfter name change:");
        postgraduateStudent.display();

    }
}
