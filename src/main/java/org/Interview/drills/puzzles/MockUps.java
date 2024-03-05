package org.Interview.drills.puzzles;

import java.util.Random;

public class MockUps {

    public int getSum(int A, int B, int C) {

        return A + B + C;
    }

public static String getWrongAnswer (int N, String C) {
        StringBuilder allWrong = new StringBuilder();
        for(int i = 0; i < N; i++){
            char correctAnswers = C.charAt(i);
            if(correctAnswers == 'A') {
                allWrong.append('B');
                } else {
                allWrong.append('A');
            }
    }

        return allWrong.toString();
}

// Refactored
    public static String getWrongAnswers2(int N, String C) {
        StringBuilder result = new StringBuilder();
        Random R = new Random();

        for (int i = 0; i < N; i++) {
            char correctAnswer = C.charAt(i);

            char wrongAnswer = (correctAnswer == 'A') ? 'B' : 'A';

            result.append(wrongAnswer);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getWrongAnswers2(3, "ABA"));

    }



}
