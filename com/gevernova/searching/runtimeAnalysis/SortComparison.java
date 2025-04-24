package com.gevernova.searching.runtimeAnalysis;


import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11, 90, 33, 7, 5, 3, 15, 45, 77};

        testSort("Bubble Sort", original, SortComparison::bubbleSort);
        testSort("Merge Sort", original, SortComparison::mergeSort);
        testSort("Quick Sort", original, SortComparison::quickSort);
    }

    interface SortAlgorithm {
        void sort(int[] arr);
    }

    public static void testSort(String name, int[] original, SortAlgorithm algorithm) {
        int[] data = Arrays.copyOf(original, original.length);

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Clean up memory

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        algorithm.sort(data);

        long endTime = System.nanoTime();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("\n" + name + ":");
        System.out.println("Sorted: " + Arrays.toString(data));
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Memory used: " + (memoryAfter - memoryBefore) + " bytes");
    }

    // 1. Bubble Sort (O(n^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 2. Merge Sort (O(n log n)) - Stable
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // 3. Quick Sort (O(n log n)) - Unstable
    public static void quickSort(int[] arr) {
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    public static void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortRecursive(arr, low, pivotIndex - 1);
            quickSortRecursive(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}

