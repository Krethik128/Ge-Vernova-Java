package com.gevernova.constructors.instances.productInventory;

public class ProductInventory {
    public static void main(String args[]){
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 799.99);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        // Call class method to display total products
        Product.displayTotalProducts();
    }
}
