package com.gevernova.recursion;

public class PrintNDowntoOne {
     void NtoOne(int N){
        if(N<1) return;
        System.out.println(N);
        NtoOne(N-1);
    }
    public static void main(String[] args) {
        PrintNDowntoOne n=new PrintNDowntoOne();
        n.NtoOne(10);
    }
}
