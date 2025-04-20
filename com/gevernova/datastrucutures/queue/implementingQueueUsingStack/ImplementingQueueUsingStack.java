package com.gevernova.datastrucutures.queue.implementingQueueUsingStack;

public class ImplementingQueueUsingStack {

    stack stack1=new stack(20);
    stack stack2=new stack(20);
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("Enqueued: " + data);
    }
    public void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int removed = stack2.pop();
        System.out.println("Dequeued: " + removed);
    }
    public void peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Front: " + stack2.peek());
    }
    public static void main(String []args){
        ImplementingQueueUsingStack queue = new ImplementingQueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.peek();     // Should show 10
        queue.dequeue();  // Should remove 10
        queue.peek();     // Should show 20
        queue.dequeue();  // Should remove 20
        queue.dequeue();  // Should remove 30
        queue.dequeue();  // Should show "Queue is empty"
    }
}
