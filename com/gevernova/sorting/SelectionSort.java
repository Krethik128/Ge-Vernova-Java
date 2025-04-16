package com.gevernova.sorting;

import java.util.Scanner;

 class SelectionSort {
    // Selection sort function
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap if new minimum is found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter size of array:");
         int size = sc.nextInt();

         int[] arr = new int[size];

         System.out.println("Enter array elements:");
         for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
         }

         System.out.println("Original array:");
         for (int num : arr) {
             System.out.print(num + " ");
         }

         selectionSort(arr, arr.length);

         System.out.println("\nSorted array using Selection Sort:");
         for (int num : arr) {
             System.out.print(num + " ");
         }

         sc.close();
     }
}

