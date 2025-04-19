package com.gevernova.datastrucutures.stack.stackImplementatoin;

public class stack {
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
    public void pop() {
        if (curr <= 0) {
            System.out.println("Stack is empty");
            return;
        }
        curr--;
        System.out.println("Popped: " + stack[curr]);
    }

    public void peek() {
        if (curr <= 0) {
            System.out.println("No element is present");
            return;
        }
        System.out.println("Top element: " + stack[curr - 1]);
    }
    public void printStack() {
        System.out.print("Stack elements: ");
        for (int i = 0; i < curr; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
