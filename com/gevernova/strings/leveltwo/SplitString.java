package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class SplitString {
    public static int getLength(String string){
        int count=0;
        while(true){
            try{
                string.charAt(count);//str[i];
                count++;
            }catch (StringIndexOutOfBoundsException e) {

                break;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        int length=getLength(string);

        int wordCount=1;
        for(int i=0;i<length;i++){
            if(string.charAt(i)==' '){
                wordCount++;
            }
        }
        String arr[]=new String[wordCount];
        int idx=0;
        int start=0;
        for(int i=0;i<length;i++){
            if(string.charAt(i)==' '){
                String temp="";
                for(int j=start;j<i;j++){
                    temp+=string.charAt(j);
                }
                start=i+1;
                arr[idx]=temp;
                idx++;
            }
        }
        String temp = "";
        for (int j = start; j < length; j++) {
            temp += string.charAt(j);
        }

        String[] builtInWords = string.split(" ");
        System.out.println("Built-in split: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Manual split: ");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
