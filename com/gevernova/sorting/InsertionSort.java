package com.gevernova.sorting;

import java.util.Scanner;

public class InsertionSort {

    // Standard insertion sort on array
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one step ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        insertionSort(array, array.length);

        System.out.println("\nSorted array using Insertion Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
