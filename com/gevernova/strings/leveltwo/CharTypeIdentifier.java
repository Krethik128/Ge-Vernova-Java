package com.gevernova.strings.leveltwo;

import java.util.Scanner;
public class CharTypeIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);

            if (charAt >= 'a' && charAt <= 'z') {
                if (isVowel(charAt)) {
                    System.out.println(charAt + " - Vowel");
                } else {
                    System.out.println(charAt + " - Consonant");
                }
            }
            else{
                System.out.println(charAt + " - Not a Letter");
            }

        }
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

