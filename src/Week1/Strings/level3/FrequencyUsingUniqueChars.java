package src.week1.strings.level3;

import java.util.Scanner;

class FrequencyUsingUniqueChars {
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

        for (int i = 0; i < uniqueChars.length(); i++) {
            char c = uniqueChars.charAt(i);
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

