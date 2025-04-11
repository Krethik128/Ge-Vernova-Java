package com.gevernova.constructors.oops.encapsulation;

import java.util.ArrayList;

abstract class Product{
    private int productId;
    private String name;
    private double price;
    protected double discount;
    protected double tax;

    public Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    abstract void calculateDiscount();

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTax() {
        return tax;
    }

    public double getFinalPrice() {
        return price + tax - discount;
    }
}
interface Taxable{
    void calculateTax();
    void getTaxDetails();
}
class Electronics extends Product implements Taxable{
    public Electronics(int productId, String name, double price){
        super(productId,name,price);
    }

    @Override
    public void calculateDiscount() {
        discount = getPrice() * 0.10; // 10% discount
    }
    @Override
    public void calculateTax() {
        tax = getPrice() * 0.18; // 18% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("18% GST applied on Electronics.");
    }

}
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    void calculateDiscount() {
        discount = getPrice() * 0.20; // 20% discount
    }

    @Override
    public void calculateTax() {
        tax = getPrice() * 0.05; // 5% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("5% GST applied on Clothing.");
    }
}
class Groceries extends Product{
    public Groceries(int productId,String name,double price){
        super(productId,name,price);
    }
    @Override
    public void calculateDiscount(){
        discount = getPrice() * 0.05;
    }
}
public class ECommercePlatform {
        public static void main(String[] args) {
            ArrayList<Product> cart = new ArrayList<>();

            Product laptop = new Electronics(101, "Laptop", 80000);
            Product shirt = new Clothing(102, "Shirt", 1500);
            Product rice = new Groceries(103, "Rice", 800);

            cart.add(laptop);
            cart.add(shirt);
            cart.add(rice);

            for (Product p : cart) {
                p.calculateDiscount();
                if (p instanceof Taxable) {
                    ((Taxable) p).calculateTax();
                    ((Taxable) p).getTaxDetails();
                }

                System.out.println("\nProduct: " + p.getName());
                System.out.println("Base Price: ₹" + p.getPrice());
                System.out.println("Discount: ₹" + p.getDiscount());
                System.out.println("Tax: ₹" + p.getTax());
                System.out.println("Final Price: ₹" + p.getFinalPrice());
            }
        }
}
