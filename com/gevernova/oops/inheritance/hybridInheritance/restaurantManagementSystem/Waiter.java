package com.gevernova.oops.inheritance.hybridInheritance.restaurantManagementSystem;

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Taking orders and serving food.");
    }
}
