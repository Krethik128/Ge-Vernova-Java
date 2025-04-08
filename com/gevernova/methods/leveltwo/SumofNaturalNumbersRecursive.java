package com.gevernova.methods.leveltwo;

import java.util.Scanner;

public class SumofNaturalNumbersRecursive {
    public static int FindsumRecursive(int n,int i){
        if(i>n) return 0;
        int sum=i+FindsumRecursive(n,i+1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum od n Natural numbers using Recursion is :"+FindsumRecursive(n,0));
        System.out.println("The sum od n Natural numbers using Formula n*(n+1)/2 is :"+n*(n+1)/2);

    }
}
