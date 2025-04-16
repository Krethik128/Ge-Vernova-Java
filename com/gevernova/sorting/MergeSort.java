package com.gevernova.sorting;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Compare elements from both lists and add the smaller one
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements (if any)
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return arr;

        int mid = arr.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of ArrayList:");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Original ArrayList:");
        System.out.println(arr);

        ArrayList<Integer> sortedArr = mergeSort(arr);

        System.out.println("Sorted ArrayList using Merge Sort:");
        System.out.println(sortedArr);

    }
}
