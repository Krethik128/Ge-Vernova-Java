package com.gevernova.strings.levelthree;

import java.util.Scanner;

class FrequencyUsingCharAt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        int[] freqency = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < string.length(); i++) {
            freqency[string.charAt(i)]++;
        }

        for (int i = 0; i < freqency.length; i++) {
            if (freqency[i] > 0) {
                System.out.println((char) i + ": " + freqency[i]);
            }
        }
    }
}

