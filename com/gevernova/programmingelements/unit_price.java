package com.gevernova.programmingelements;

import java.util.*;
public class unit_price {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int unitprice=sc.nextInt();
        int quantity=sc.nextInt();
        int amount=unitprice*quantity;
        System.out.println("The total amount is "+amount);

    }
}
