package com.gevernova.objectinspector.universitySystem;

public class UniversitySystem {
    public static void main(String[] args) {
        Student studentOne = new Student(1, "John", "A");
        Student studentTwo = new Student(2, "Jane", "B");

        if (studentOne instanceof Student) studentOne.displayDetails();
        if (studentTwo instanceof Student) studentTwo.displayDetails();

        Student.displayTotalStudents();
    }
}
