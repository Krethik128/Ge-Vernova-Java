package com.gevernova.oops.inheritance.hierarchicalInheritance.schoolSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- School System ---");
        Person teacher = new Teacher("Anna", 30, "Math");
        Person student = new Student("Rohan", 16, "10th Grade");
        Person staff = new Staff("Sushil", 40, "Librarian");

        teacher.displayBasicInfo();
        ((Teacher) teacher).displayRole();
        System.out.println();
        student.displayBasicInfo();
        ((Student) student).displayRole();
        System.out.println();
        staff.displayBasicInfo();
        ((Staff) staff).displayRole();
    }
}
