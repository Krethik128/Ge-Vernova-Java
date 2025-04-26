package com.gevernova.constructors.instances.productInventory;

public class ProductInventory {
    public static void main(String args[]){
        Product product = new Product("Laptop", 1200.50);
        Product smartphone = new Product("Smartphone", 799.99);

        product.displayProductDetails();
        System.out.println();
        smartphone.displayProductDetails();
        System.out.println();

        // Call class method to display total products
        Product.displayTotalProducts();
    }
}
