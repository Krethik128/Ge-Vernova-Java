package com.gevernova.oops.polymorphism.vehicleRentalSystem;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bike("MH-01-BK-1234", "Bike", 200));
        vehicles.add(new Car("TS-08-HR-6693", "Car", 1500, 'A', 2));
        vehicles.add(new Truck("KA-05-MR-4455", "Truck", 3000));

        // Polymorphic loop over all vehicle types
        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Info ---");
            v.displayDetails();
            v.calculateRentalCost(5); // Rent for 5 days

            // instanceof checks whether the vehicle also supports insurance
            if (v instanceof Insurable) {
                ((Insurable) v).calculateInsurance();
                ((Insurable) v).getInsuranceDetails();
            }
        }
    }
}
