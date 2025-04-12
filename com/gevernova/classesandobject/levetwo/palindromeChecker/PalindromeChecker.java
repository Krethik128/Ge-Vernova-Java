package com.gevernova.classesandobject.levetwo.palindromeChecker;

class PalindromeChecker {
    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString()); //reversing the clean string by stringbuilder and converting back to string
    }

    void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome? " + isPalindrome());
    }
}
