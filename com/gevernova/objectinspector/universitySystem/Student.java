package com.gevernova.objectinspector.universitySystem;

class Student {
    public static String universityName;
    private static int totalStudents;
    public final int rollNumber;
    public String name;
    public String grade;

    static {
        universityName = " University of Hyderabad";
        totalStudents = 0;
    }

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }
}
