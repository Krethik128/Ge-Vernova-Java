package com.gevernova.programmingelements;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double result1=a+b*c;
        double result2=a * b + c;
        double result3=c + a / b;
        double result4= a % b + c;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
