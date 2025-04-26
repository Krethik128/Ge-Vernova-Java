package com.gevernova.programmingelements;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextInt();
        double b=scanner.nextInt();
        double c=scanner.nextInt();
        double resultOne=a+b*c;
        double resultTwo=a * b + c;
        double resultThree=c + a / b;
        double resultFour= a % b + c;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
    }
}
