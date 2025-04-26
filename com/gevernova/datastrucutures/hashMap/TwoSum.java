package com.gevernova.datastrucutures.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter integers (non-int to stop):");
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        scanner.next();
        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< list.size();i++){
            int num=list.get(i);
            int complement=target-num;
            if(map.getOrDefault(complement, 0) > 0){
                System.out.println("Two sum found: " + complement + " + " + num + " = " + target);
                System.out.println("Indices: " + map.get(complement) + " and " + i);
            }
            // store the number and its index
                map.put(num, map.getOrDefault(complement,0)+1);
        }
        System.out.println("No pair found with the given sum.");
    }
}
