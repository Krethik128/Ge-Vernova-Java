package com.gevernova.oops.polymorphism.vehicleRentalSystem;

// Car is both rentable and insurable
class Car extends Vehicle implements Insurable {
    private char model;
    private final int yearsOld;

    public Car(String vehicleNumber, String type, int rentalRate, char model, int yearsOld) {
        super(vehicleNumber, type, rentalRate);
        this.model = model;
        this.yearsOld = yearsOld;
    }

    public char getModel() {
        return model;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    @Override
    public void calculateInsurance() {
        double insurance = (getRentalRate() * 0.1) * (5 - Math.min(yearsOld, 5));
        System.out.println("Car Insurance Amount: ₹" + insurance);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car model: " + model + " | Years Old: " + yearsOld);
    }

    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days;
        if (model == 'A') {
            cost *= 1.2;
        } else if (model == 'B') {
            cost *= 1.1;
        }
        System.out.println("Car Rental Cost for " + days + " days: ₹" + cost);
    }
}
