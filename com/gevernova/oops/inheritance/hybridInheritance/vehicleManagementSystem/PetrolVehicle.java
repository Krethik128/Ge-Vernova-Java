package com.gevernova.oops.inheritance.hybridInheritance.vehicleManagementSystem;

class PetrolVehicle extends BaseVehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}
