package org.Interview.drills;

public class FizzBuzzTest {

    public static void main(String[] args) {
        testFizzBuzz();
    }

    public static void testFizzBuzz() {
        System.out.println("Testing FizzBuzz method...");

        // Test case 1: start = 1, end = 15
        System.out.println("Test case 1:");
        System.out.println("Expected output:");
        System.out.println("1\n2\nFizz\n4\nBuzz\nFizz\nBaZZ\n8\nFizz\nBuzz\n11\nFizz\n13\nBaZZ\nFizzBuzz 15");
        System.out.println("Actual output:");
        FizzBuzz.fizzBuzzInput(1, 15);

        // Test case 2: start = 10, end = 20
        System.out.println("\nTest case 2:");
        System.out.println("Expected output:");
        System.out.println("Buzz 10\n11\nFizz\nBaZZ\n13\nFizzBuzz 14\n16\n17\nFizz\n19\nBuzz");
        System.out.println("Actual output:");
        FizzBuzz.fizzBuzzInput(10, 20);

        // Test case 3: start = 20, end = 25
        System.out.println("\nTest case 3:");
        System.out.println("Expected output:");
        System.out.println("Buzz 20\nFizz 21\n22\nFizz 23\nBuzz 24\nFizzBuzz 25");
        System.out.println("Actual output:");
        FizzBuzz.fizzBuzzInput(20, 25);
    }
}

