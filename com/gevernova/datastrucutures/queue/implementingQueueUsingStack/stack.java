package com.gevernova.datastrucutures.queue.implementingQueueUsingStack;

public class stack { //Stack class instead of Stack<Integer>
    private final int MAX_SIZE;
    private int curr = 0;
    private int[] stack;

    public stack(final int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.stack = new int[MAX_SIZE];
    }

    public int getSize() {
        return stack.length;
    }

    public void push(int ele) {
        if (curr >= MAX_SIZE) {
            System.out.println("Stack is full");
            return;
        }
        stack[curr] = ele;
        curr++;
        System.out.println("Pushed: " + ele);
    }
    public int pop() {
        if (curr <= 0) {
            System.out.println("Stack is empty");
            return -1; // or throw exception
        }
        return stack[--curr];
    }

    public int peek() {
        if (curr <= 0) {
            System.out.println("No element is present");
            return -1;
        }
        return stack[curr - 1];
    }
    public void printStack() {
        System.out.print("Stack elements: ");
        for (int i = 0; i < curr; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return curr == 0;
    }
}
