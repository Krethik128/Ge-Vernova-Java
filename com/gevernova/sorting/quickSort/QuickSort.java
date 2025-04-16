package com.gevernova.sorting.quickSort;


public class QuickSort {
    public static void main(String[] args) {
        int[] data = { 10, 7, 8, 9, 1, 5 };
        int[] sorted = Sorting.quickSort(data);

        System.out.println("Sorted array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
