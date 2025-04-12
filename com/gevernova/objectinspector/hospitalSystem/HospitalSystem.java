package com.gevernova.objectinspector.hospitalSystem;

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(201, "Ravi", 45, "Fever");
        Patient p2 = new Patient(202, "Sara", 30, "Cold");

        if (p1 instanceof Patient) p1.displayDetails();
        if (p2 instanceof Patient) p2.displayDetails();

        Patient.getTotalPatients();
    }
}

