package com.gevernova.strings.levelthree;

class FrequencyUsingNestedLoops {
    public static void main(String[] args) {
        String string = "example";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == c) {
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
    }
}

