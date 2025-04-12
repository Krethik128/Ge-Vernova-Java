package com.gevernova.objectinspector.universitySystem;

public class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "A");
        Student s2 = new Student(2, "Jane", "B");

        if (s1 instanceof Student) s1.displayDetails();
        if (s2 instanceof Student) s2.displayDetails();

        Student.displayTotalStudents();
    }
}
