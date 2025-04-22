package com.gevernova.datastrucutures.hashMap;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> mp = new TreeMap<String, ArrayList<String>>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            // Sort the array
            Arrays.sort(chars);
            // Convert back to string
            String sortedStr = new String(chars);
            if (!mp.containsKey(sortedStr)) {
                mp.put(sortedStr, new ArrayList<>());
            }
            mp.get(sortedStr).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : mp.keySet()) {
            result.add(mp.get(key));
        }
        return result;
    }
    public static void main(String[] args) {


    }
}

