package com.gevernova.datastrucutures.stack.sortStackRecursively;

import java.util.Stack;

public class SortStackRecursively {

    // Main recursive sort function
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();              // Step 1: Pop top
            sortStack(stack);                   // Step 2: Sort remaining stack
            insertSorted(stack, top);           // Step 3: Insert top in sorted order
        }
    }

    // Helper to insert element into the sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: stack is empty or top is smaller than element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Otherwise, pop the top, insert recursively
        int top = stack.pop();
        insertSorted(stack, element);

        // Push the top back after inserting
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack:   " + stack);
    }
}

