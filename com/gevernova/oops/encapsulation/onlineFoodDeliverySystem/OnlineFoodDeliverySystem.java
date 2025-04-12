package com.gevernova.oops.encapsulation.onlineFoodDeliverySystem;

public class OnlineFoodDeliverySystem {
    // Common method to process food orders using polymorphism
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        item.calculateTotalPrice(); // dynamic method dispatch

        if (item instanceof Discountable) {
            ((Discountable) item).applyDiscount(); // safe downcast
            ((Discountable) item).getDiscountDetails();
        }

        System.out.println("Total Price to Pay: ₹" + item.getTotalPrice());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 3);

        processOrder(item1);
        processOrder(item2);
    }
}
