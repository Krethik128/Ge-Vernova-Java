package com.gevernova.datastrucutures.queue;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0, deficit = 0, balance = 0;

        for(int i=0;i<petrol.length;i++){
            balance=petrol[i]-distance[i];
            if(balance<0){
                // Can't start from current 'start', move to next
                start=i+1;
                deficit+=balance;
                balance=0;

            }
        }
        return (deficit+balance)>0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);
        if (start != -1)
            System.out.println("Start at petrol pump index: " + start);
        else
            System.out.println("No solution exists");
    }
}

