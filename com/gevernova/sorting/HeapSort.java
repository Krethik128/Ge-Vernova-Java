package com.gevernova.sorting;

import java.util.Scanner;

public class HeapSort {

    // Heapify a subtree rooted at index i in an array of size n
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;       // Assume root is largest
        int left = 2 * i + 1;  // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to perform heap sort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Step 1: Build Max Heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reheapify reduced heap
            heapify(array, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of job applicants:");
        int n = scanner.nextInt();

        int[] salaries = new int[n];

        System.out.println("Enter expected salaries of applicants:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextInt();
        }

        System.out.println("Original Salary Demands:");
        for (int sal : salaries) {
            System.out.print(sal + " ");
        }

        heapSort(salaries);

        System.out.println("\nSorted Salary Demands (Ascending Order):");
        for (int sal : salaries) {
            System.out.print(sal + " ");
        }

        scanner.close();
    }
}

