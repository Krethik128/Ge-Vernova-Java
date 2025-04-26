package com.gevernova.strings.levelthree;

import java.util.Scanner;

class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        String uniqueChars = "";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (uniqueChars.indexOf(c) == -1) {
                uniqueChars += c;
            }
        }

        System.out.println("Unique characters: " + uniqueChars);
    }
}

