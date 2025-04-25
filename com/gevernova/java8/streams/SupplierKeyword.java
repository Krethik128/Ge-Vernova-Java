package com.gevernova.java8.streams;

import java.util.function.Supplier;

public class SupplierKeyword {
    public static void main(String[] args){
        //No parameters Passed
        Supplier<String> returns=()->"Hello World";// Return without taking any Input

        System.out.println(returns.get());
    }
}
