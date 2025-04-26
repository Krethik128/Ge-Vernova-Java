package com.gevernova.strings.levelthree;

import java.util.Arrays;

class AnagramCheck {
    public static void main(String[] args) {
        String string = "listen";
        String stringTwo = "silent";
        boolean isAnagram = checkAnagram(string, stringTwo);
        System.out.println("Are anagrams: " + isAnagram);
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

