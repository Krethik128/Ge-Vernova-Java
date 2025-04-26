package com.gevernova.strings.levelone;
import java.util.Arrays;
import java.util.Scanner;
public class PrintEachChar {
    public static char[] ConvertIntoArr(String string){
        char[] array=new char[string.length()];
        for(int i=0;i<string.length();i++){
            array[i]=string.charAt(i);
        }
        return array;
    }
    public static boolean compareArrays(char stringOne[],char stringTwo[]){
        if(stringOne.length!=stringTwo.length) return false;
        for(int i=0;i<stringOne.length;i++){
            if(stringOne[i]!=stringTwo[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String stringOne=sc.next();
        char[] userDefinedArray=ConvertIntoArr(stringOne);
        char[] builtInArray = stringOne.toCharArray();
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
