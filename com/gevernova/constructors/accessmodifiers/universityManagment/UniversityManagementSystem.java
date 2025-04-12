package com.gevernova.constructors.accessmodifiers;
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(double CGPA, int rollNumber, String name) {
        this.CGPA = CGPA;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public double getCGPA() {
        return CGPA;
    }
    void display() {
        System.out.println("Name: " + name); // ✅ name is protected, accessible here
        System.out.println("Roll No: " + rollNumber); // ✅ public
        System.out.println("Unchanged name: " + name);
        System.out.println("CGPA: " + getCGPA()); // ✅ CGPA is private, use getter
    }

}
class PostgraduateStudent extends Student{
    private String specialization;

    public PostgraduateStudent(double CGPA, int rollNumber, String name) {
        super(CGPA, rollNumber, name);
    }

    public void changeName(String newName){
        this.name=newName;
        System.out.println("Name is updated to: " + this.name);
    }
    @Override
    void display() {
        System.out.println("Name: " + name); // ✅ name is protected, accessible here
        System.out.println("Roll No: " + rollNumber); // ✅ public
        System.out.println("Changed name: " + name);
        System.out.println("CGPA: " + getCGPA()); // ✅ CGPA is private, use getter
    }
}
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
