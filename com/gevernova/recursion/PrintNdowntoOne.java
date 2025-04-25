package com.gevernova.recursion;

public class PrintNdowntoOne {
     void Nto1(int N){
        if(N<1) return;
        System.out.println(N);
        Nto1(N-1);
    }
    public static void main(String[] args) {
        PrintNdowntoOne n=new PrintNdowntoOne();
        n.Nto1(10);
    }
}
