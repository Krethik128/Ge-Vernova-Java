package com.gevernova.searching.runtimeAnalysis;

public class SearchATarget {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 9, 5};
        int key = 5;

        Runtime runtime = Runtime.getRuntime();

        // Run garbage collector to get clean memory usage runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Time before
        long startTime = System.nanoTime();

        int result = linearSearch(numbers, key);

        // Time after
        long endTime = System.nanoTime();

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        if (result == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Memory used: " + (memoryAfter - memoryBefore) + " bytes");
    }

}
