package com.gevernova.strings.levelone;
import java.util.Scanner;
public class Substr {
    public static boolean comparecharat(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String s1 = sc.next();
        int len1=s.length();
        int len2=s1.length();
        boolean isSame = comparecharat(s, s1);
        boolean equalsComparison = s.substring(0,len1).equals(s1.substring(0,len2));

        if (isSame == equalsComparison) {
            System.out.println("Both comparison methods give the same result");
        } else {
            System.out.println("The results of both comparison methods differ.");
        }
    }
}
