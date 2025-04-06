package src.Week1.Strings.Level2;

import java.util.Scanner;
public class CharTypeIdentifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    System.out.println(ch + " - Vowel");
                } else {
                    System.out.println(ch + " - Consonant");
                }
            }
            else{
                System.out.println(ch + " - Not a Letter");
            }

        }
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

