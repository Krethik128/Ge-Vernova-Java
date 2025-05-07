package com.gevernova.java8.streams.streamAPI;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //collect names base on their length
        List<String> stringList = Arrays.asList("Krethik", "Stuti", "Krethik", "Ana", "Ayush","Ben");
        System.out.println(stringList.stream()
                .collect(Collectors.groupingBy(String::length)));

        String str="Krethik is Krethik but Krithik is not Krethik";
        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x)));
        List<Integer> intList=Arrays.asList(1,2,3,4,5,5,6,6,15);
        System.out.println(intList.stream().collect(Collectors.groupingBy(x->x%2==0)));
    }
}
