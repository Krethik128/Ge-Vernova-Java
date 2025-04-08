package com.gevernova.strings.levelone;
import java.util.Arrays;
import java.util.Scanner;
public class PrintEachChar {
    public static char[] ConvertIntoArr(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char a1[],char a2[]){
        if(a1.length!=a2.length) return false;
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char[] userDefinedArray=ConvertIntoArr(s1);
        char[] builtInArray = s1.toCharArray();
        boolean areEqual=compareArrays(userDefinedArray,builtInArray);

        System.out.println("User-defined method output: " + Arrays.toString(userDefinedArray));
        System.out.println("Built-in toCharArray() output: " + Arrays.toString(builtInArray));

        if (areEqual) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results of both methods differ.");
        }
    }
}
