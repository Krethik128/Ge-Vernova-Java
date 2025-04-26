package com.gevernova.programmingelements;

import java.util.*;
public class UnitPrice {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int unitPrice=scanner.nextInt();
        int quantity=scanner.nextInt();
        int amount=unitPrice*quantity;
        System.out.println("The total amount is "+amount);

    }
}
