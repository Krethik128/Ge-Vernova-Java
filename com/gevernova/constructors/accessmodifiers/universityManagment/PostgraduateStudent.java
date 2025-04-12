package com.gevernova.constructors.accessmodifiers.universityManagment;

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(double CGPA, int rollNumber, String name) {
        super(CGPA, rollNumber, name);
    }

    public void changeName(String newName) {
        this.name = newName;
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
