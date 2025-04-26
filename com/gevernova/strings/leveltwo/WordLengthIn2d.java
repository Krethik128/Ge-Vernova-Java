package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class WordLengthIn2d {
    public static int getLength(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);//str[i];
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
        String[][] arr =new String[wordCount][2];
        int idx=0;
        int start=0;
        for(int i=0;i<length;i++){
            if(string.charAt(i)==' '){
                String temp="";
                for(int j=start;j<i;j++){
                    temp+=string.charAt(j);
                }

                arr[idx][0]=temp;
                arr[idx][1]=String.valueOf(getLength(temp));;
                idx++;
                start=i+1;
            }
        }
        String temporary = "";
        for (int j = start; j < length; j++) {
            temporary += string.charAt(j);
        }
        arr[idx][0] = temporary;
        arr[idx][1] = String.valueOf(getLength(temporary));

        System.out.println("\nWord\tLength");
        for (String[] strings : arr) {
            String word = strings[0];
            int localLength = Integer.parseInt(strings[1]);
            System.out.println(word + "\t" + localLength);
        }
    }
}
