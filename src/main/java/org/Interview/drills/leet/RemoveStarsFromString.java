package org.Interview.drills.leet;

import java.util.Stack;

public class RemoveStarsFromString {


    public String removeStars0(String s) {
        StringBuilder ans = new StringBuilder();
        int star = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '*') {
                star++;
            } else if (star == 0) {
                ans.append(s.charAt(i));
            } else {
                star--;
            }
        }
        return ans.toString();
    }


    public String removeStars64(String s) {

        Stack<Character> word = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                word.push(s.charAt(i));
            } else {
                word.pop();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : word) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }



    public String removeStars3(String s) {
        StringBuilder ans = new StringBuilder();
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                star++;
            } else if (star == 0) {
                ans.append(s.charAt(i));
            } else {
                star--;
            }
        }
        return ans.toString();
    }


    public String removeStars8(String s) {   //82
        StringBuilder ans = new StringBuilder();
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 0) {
                star++;
            } else if (star == 0) {
                ans.append(s.charAt(i));
            } else {
                ans.append(s.charAt(i));
                star = 0;
            }
        }
        return ans.toString();
    }


    public String removeStars(String s) {  // 3/7
        Stack<Character> word = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                word.push(s.charAt(i));
            } else {
                if (!word.isEmpty()) {
                    word.pop();
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : word) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }


    public String removeStars55e(String s) {
        Stack<Character> word = new Stack<>();
        int currentChar = 0;
        while (currentChar < s.length()) {
            if (s.charAt(currentChar) != '*') {
                word.push(s.charAt(currentChar));
            } else {
                while (currentChar < s.length() && s.charAt(currentChar) == '*') {
                    currentChar++;
                }
                if (!word.isEmpty()) {
                    word.pop();
                }
                continue;
            }
            currentChar++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : word) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        RemoveStarsFromString remover = new RemoveStarsFromString();

        // Example 1
        String input1 = "leet**cod*e";
        String result1 = remover.removeStars(input1);
        System.out.println("Example 1: " + result1); // Expected output: "lecoe"

        // Example 2
        String input2 = "erase*****";
        String result2 = remover.removeStars(input2);
        System.out.println("Example 2: " + result2); // Expected output: ""
    }


}
