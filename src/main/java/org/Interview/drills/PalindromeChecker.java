package org.Interview.drills;

import java.util.function.Predicate;


public class PalindromeChecker {

    public static void main(String[] args) {
        // Test strings
        String[] testForPalindrome = {"CHEESE", "heLLo", "Pop", "Kids", "Mom"};

        // To check if this is a palindrome this will define a predicate lambda to check
        Predicate<String> isPalindrome = str -> {
            // This converts the string to lowercase to handle case-insensitivity
            str = str.toLowerCase();

            // Initialize pointers for the start and end of the string
            int left = 0;
            int right = str.length() - 1;

            // Iterate over the string from both ends
            while (left < right) {
                // If characters at current positions don't match, return false
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                // Move the pointers towards each other
                left++;
                right--;
            }
            // If the loop completes without returning false, the string is a palindrome
            return true;
        };

        // Apply the predicate to each test string using forEach
        for (String palindromeTest : testForPalindrome) {
            System.out.println("Let's check to see if \"" + palindromeTest + "\" a palindrome? \n This is ----> " + isPalindrome.test(palindromeTest));
        }
    }
}

//--------> WILL PRINT OUT THIS

//This is ----> false
//Let's check to see if "hello" a palindrome?
//This is ----> false
//Let's check to see if "Pop" a palindrome?
//This is ----> true
//Let's check to see if "Kids" a palindrome?
//This is ----> false
//Let's check to see if "Mom" a palindrome?
//This is ----> true

// FIXME --> TURN THIS INTO SOMETHING YOU CAN USE LATER
//