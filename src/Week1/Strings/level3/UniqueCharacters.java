package src.week1.strings.level3;

import java.util.Scanner;

class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (uniqueChars.indexOf(c) == -1) {
                uniqueChars += c;
            }
        }

        System.out.println("Unique characters: " + uniqueChars);
    }
}

