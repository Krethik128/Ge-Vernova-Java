package com.gevernova.searching.runtimeAnalysis;

public class StringConcatComparison {

    public static void main(String[] args) {
        int iterations = 1_000_000;

        testConcat("String", iterations, StringConcatComparison::concatWithString);
        testConcat("StringBuilder", iterations, StringConcatComparison::concatWithStringBuilder);
        testConcat("StringBuffer", iterations, StringConcatComparison::concatWithStringBuffer);
    }

    interface ConcatMethod {
        void run(int iterations);
    }

    public static void testConcat(String type, int iterations, ConcatMethod method) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Clean memory

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        method.run(iterations);

        long endTime = System.nanoTime();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("\n" + type + " Concatenation:");
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Memory used: " + (memoryAfter - memoryBefore) / 1024 + " KB");
    }

    // Inefficient: creates a new object on each concatenation
    public static void concatWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "a";
        }
    }

    // Efficient: uses a mutable buffer
    public static void concatWithStringBuilder(int iterations) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("a");
        }
    }

    // Thread-safe version of StringBuilder
    public static void concatWithStringBuffer(int iterations) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append("a");
        }
    }
}

