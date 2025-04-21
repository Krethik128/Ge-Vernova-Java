package com.gevernova.datastrucutures.hashMap;

import java.util.*;


public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr={10,23,43,54,1,5,85,10,4,2};
        int sum=12;
        boolean pairFound = false;
        Collection<Integer> newarr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int remainder=sum-num;
            if(map.containsKey(remainder)){
                System.out.println("Pair is present: " + num + " + " + remainder + " = " + sum);
                pairFound=true;
                break;
            }
            map.put(num,i);
        }
        for(Integer key:map.keySet()){
            System.out.println(key +" is key and value is "+map.get(key));
        }
        map.get(10);
        if (!pairFound) {
            System.out.println("No pair is present with the given sum");
        }
    }
}
