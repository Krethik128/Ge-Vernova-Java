package com.gevernova.constructors.instances.productInventory;

class Product {
    private String productName;
    private double price;
    // Class variable to keep count of total products
    static int totalProducts;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
