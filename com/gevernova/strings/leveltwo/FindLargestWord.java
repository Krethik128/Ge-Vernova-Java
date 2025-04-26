package com.gevernova.strings.leveltwo;

import java.util.*;
public class FindLargestWord {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String[] builtInWords=string.split(" ");
        int maximum=0;
        String temp="";
        for(String st:builtInWords){
            if(st.length()>maximum){
                maximum=st.length();
                temp=st;
            }
        }
        System.out.println("Maximum length is of word "+temp+" in "+ string +" is "+maximum);
    }
}
