package com.gevernova.objectinspector.hospitalSystem;

public class HospitalSystem {
    public static void main(String[] args) {
        Patient patientOne = new Patient(201, "Ravi", 45, "Fever");
        Patient patientTwo = new Patient(202, "Sara", 30, "Cold");

        if (patientOne instanceof Patient) patientOne.displayDetails();
        if (patientTwo instanceof Patient) patientTwo.displayDetails();

        Patient.getTotalPatients();
    }
}

