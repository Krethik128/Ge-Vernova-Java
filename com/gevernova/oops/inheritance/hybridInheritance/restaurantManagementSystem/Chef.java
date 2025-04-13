package com.gevernova.oops.inheritance.hybridInheritance.restaurantManagementSystem;

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Preparing meals and managing kitchen.");
    }
}


