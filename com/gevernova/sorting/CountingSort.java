package com.gevernova.sorting;

import java.util.Scanner;

public class CountingSort {

    // Counting sort works for non-negative integers
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum value in the array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Step 2: Create count array of size (max + 1)
        int[] count = new int[max + 1];

        // Step 3: Count occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Overwrite the original array with sorted values
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter non-negative integers to sort:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("Counting sort only works with non-negative integers.");
                return;
            }
        }

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        countingSort(array);

        System.out.println("\nSorted array using Counting Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

