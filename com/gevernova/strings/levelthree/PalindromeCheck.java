package com.gevernova.strings.levelthree;

class PalindromeCheck {
    public static void main(String[] args) {
        String string = "madam";
        boolean isPalindrome = checkPalindrome(string);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

