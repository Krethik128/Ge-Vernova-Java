package com.gevernova.constructors.instances;
class Product{
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
