package com.gevernova.strings.levelthree;

import java.util.Scanner;

class FrequencyUsingUniqueChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        String uniqueChars = "";

        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            if (uniqueChars.indexOf(charAt) == -1) {
                uniqueChars += charAt;
            }
        }

        for (int i = 0; i < uniqueChars.length(); i++) {
            char c = uniqueChars.charAt(i);
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

