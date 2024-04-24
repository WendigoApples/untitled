package org.Interview.drills;

import java.util.Scanner;

public class FizzBuzz {



    public static void fizzBuzz() {
        for (int i = 1; i < 100; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if ( i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else if ( i % 7 == 0) {
                System.out.println("BaZZ " + i);
            }
        }
    }

    public static void fizzBuzzInput(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else if (i % 7 == 0) {
                System.out.println("BaZZ " + i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        scanner.close();

        fizzBuzzInput(start, end);

    }


}
