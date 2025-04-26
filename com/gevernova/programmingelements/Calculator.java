package com.gevernova.programmingelements;

import java.util.*;

public class Calculator {
    public static void main(String args[]){
            Scanner scanner=new Scanner(System.in);
            double a=scanner.nextDouble();
            double b=scanner.nextDouble();
            double add=a+b;
            double sub=a-b;
            double mul=a*b;
            double div=a/b;
            System.out.println("Addition of "+a+" and "+b+" is "+add);
            System.out.println("Subtraction of "+a+" and "+b+" is "+sub);
            System.out.println("Multiplication of "+a+" and "+b+" is "+mul);
            System.out.println("Division of "+a+" and "+b+" is "+div);
     }
}
