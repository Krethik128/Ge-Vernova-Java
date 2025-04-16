package com.gevernova.searching.linearSearch;

import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence ");
        String str=sc.nextLine();
        System.out.println("Enter the word to find in the sentence ");
        String word=sc.nextLine();
        int j=0;
        boolean isPresent=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                String temp=str.substring(j,i);
                j=i+1;
                if(temp.equals(word)){
                    isPresent=true;
                    break;
                }
            }
        }
        String lastWord = str.substring(j);
        if (lastWord.equals(word)) {
            isPresent = true;
        }
        if (isPresent) {
            System.out.println("The word \"" + word + "\" is found in the sentence.");
        } else {
            System.out.println("The word \"" + word + "\" is not found in the sentence.");
        }

        sc.close();
    }
}
