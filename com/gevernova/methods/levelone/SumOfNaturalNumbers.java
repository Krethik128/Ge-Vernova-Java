package com.gevernova.methods.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void findSumofNaturalNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of "+n+" naturals number is "+sum);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive number :");
        int n=scanner.nextInt();
        findSumofNaturalNumber(n);
    }
}
