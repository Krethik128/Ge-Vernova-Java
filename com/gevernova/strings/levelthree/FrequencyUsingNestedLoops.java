package com.gevernova.strings.levelthree;

class FrequencyUsingNestedLoops {
    public static void main(String[] args) {
        String str = "example";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
    }
}

