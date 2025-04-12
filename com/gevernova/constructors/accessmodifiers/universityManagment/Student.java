package com.gevernova.constructors.accessmodifiers.universityManagment;

class Student {
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
