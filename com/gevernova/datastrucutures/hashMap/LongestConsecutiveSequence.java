package com.gevernova.datastrucutures.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int maxLength=0;
        for (int num : set) {
            // Only start counting if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int length = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + length);
    }
}
