package com.gevernova.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr, int n){
        boolean isSorted;
        for(int i = 0; i < n - 1; i++){
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1); // FIXED: pass indices
                    isSorted = false;
                }
            }
            if(isSorted) break; // Optimization to exit early
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        bubbleSort(arr, arr.length);

        System.out.println("\nSorted array using Bubble Sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close(); // Close scanner to avoid resource leak
    }

}

