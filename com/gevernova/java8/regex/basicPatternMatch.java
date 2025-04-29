package com.gevernova.java8.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class basicPatternMatch {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("krethik",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("Krethik yadav");
        boolean isPresent=matcher.find();
        if(isPresent){
            System.out.println("IS present ");
        }
        else{
            System.out.println("Not present");
        }

    }
}
