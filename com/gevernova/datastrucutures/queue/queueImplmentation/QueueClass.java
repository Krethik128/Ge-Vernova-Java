package com.gevernova.datastrucutures.queue.queueImplmentation;

public class QueueClass {
    private final int MAX_SIZE;
    private int[] queue;

    public QueueClass(final int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.queue=new int[MAX_SIZE];
    }
    int start=-1,end=-1;
    public void enqueue(int num){
        // Full queue condition
        if ((end + 1) % MAX_SIZE == start) {
            System.out.println("Queue is Full");
            return;
        }
        if(start==-1 ){
            start=0;
            end=0;
        }
        queue[end] = num;
        end = (end + 1) % MAX_SIZE; // wrap end for circular behavior
        System.out.println("Enqueued: " + num);
    }
    public void dequeue() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Dequeued: " + queue[start]);
        if (start == end - 1 || (end == 0 && start == MAX_SIZE - 1)) {
            // Queue is now empty
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % MAX_SIZE;
        }
    }
}
