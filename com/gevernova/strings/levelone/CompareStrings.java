package com.gevernova.strings.levelone;
import java.util.*;
public class CompareStrings {
    public static boolean compareCharat(String a,String b){
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String a=new String("krethik");
        String b=new String("krethik");

        boolean is_same=compareCharat(a,b);
        boolean equalsComparison=a.equals(b);
        if (is_same == equalsComparison) {
            System.out.println("Both strings given are same and both are in pointing at same location.");
        } else {
            System.out.println("The results of both comparison methods differ.");
        }
    }
}
