package com.gevernova.oops.inheritance.hybridInheritance.vehicleManagementSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Vehicle Management Hybrid Inheritance ---");
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.showSpecs();
        ev.charge();
        System.out.println();
        pv.showSpecs();
        pv.refuel();
    }
}
