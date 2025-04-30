package com.gevernova.java8.streams.problems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinMax {
    public static void main(String[] args) {
        Random rand=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++ ){
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        long cnt=list.stream().filter(x->x%2==1).count();
        System.out.println(cnt);
    }
}
