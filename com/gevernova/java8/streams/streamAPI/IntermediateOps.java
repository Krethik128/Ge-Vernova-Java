package com.gevernova.java8.streams.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 10, 6, 7, 7, 9);

        List<String> stringList = Arrays.asList("Krethik", "Stuti", "Krethik", "Ana", "Ayush");

        //1.filter
        System.out.println("Using filter method");
        long count = stringList.stream().filter(x -> x.startsWith("K")).count();
        System.out.println("count of String start with K are " + count);
        stringList.stream().filter(x -> x.length() >= 5).forEach(x -> System.out.print(x+" ")); //Printing based non String size > 5
        System.out.println("\n");

        //2.map
        System.out.println("Using map method");
        Stream<String> newList = stringList.stream().map(x -> x.toLowerCase());
        newList.forEach(x -> System.out.print(x.toString() + ","));

        List<String> lowerCaseList = stringList.stream().map(x -> x.toLowerCase()).toList();
        for (String str : lowerCaseList) {
            System.out.println(str);
        }
        System.out.println("\n");
        System.out.println("Using Distinct Method");
        //3.distinct
        stringList.stream().distinct().forEach(x-> System.out.print(x+" "));

        System.out.println("\n");
        //4.Sort function using comparator
        System.out.println("Using sort Method using comparator");
            List<String> stringListTwo = Arrays.asList("listen", "banana", "silent", "apple", "enlist", "cat", "tac", "act");
            stringListTwo.sort((s1,s2)->{
                String sortedS1 = sortCharacters(s1);
                String sortedS2 = sortCharacters(s2);
                return sortedS1.compareTo(sortedS2);
            });
            // Print the sorted list
            for (String str : stringListTwo) {
                System.out.println(str);
            }
        System.out.println("\n");

        //5 limit
        System.out.println("Using limit Method for limit till 3 Strings and only distinct ");
        stringList.stream().limit(3).distinct().forEach(System.out::println);




    }
    private static String sortCharacters(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
