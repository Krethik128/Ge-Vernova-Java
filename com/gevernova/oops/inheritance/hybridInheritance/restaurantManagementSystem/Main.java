package com.gevernova.oops.inheritance.hybridInheritance.restaurantManagementSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Restaurant System ---");
        Worker chef = new Chef("Gordon", 501);
        Worker waiter = new Waiter("Ramsay", 502);

        ((Chef) chef).displayInfo();
        chef.performDuties();
        System.out.println();
        ((Waiter) waiter).displayInfo();
        waiter.performDuties();
    }
}
