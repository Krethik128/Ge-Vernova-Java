package src.week1.Strings.level3;

import java.util.Scanner;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char result = findFirstNonRepeatingChar(str);
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

