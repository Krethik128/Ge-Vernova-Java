package com.gevernova.strings.levelthree;

import java.util.Scanner;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        char result = findFirstNonRepeatingChar(string);
        System.out.println("First non-repeating character: " + result);
    }

    public static char findFirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return '_'; // Return '_' if no non-repeating character is found
    }
}

