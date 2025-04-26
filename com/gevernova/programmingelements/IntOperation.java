package com.gevernova.programmingelements;

import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int resultOne=a+b*c;
        int resultTwo=a * b + c;
        int resultThree=c + a / b;
        int resultFour= a % b + c;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
    }
}
