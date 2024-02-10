package org.Interview.drills;//package org.Interview.drills;
//
//import java.util.*;
//import java.io.*;
//
//public class PrintCorrespondingSeries {
//
//
//    public static void main(String[] argh) {
//        // Create a Scanner object that reads the input from the console
//        Scanner in = new Scanner(System.in);
//
//        // Reads the number of queries that (t) has from the console
//        int t = in.nextInt();
//
//        // Loop through each query
//        for (int i = 0; i < t; i++) {
//            // Reading the values of a, b, and n to store in current query
//            int a = in.nextInt();  // Cycle One
//            int b = in.nextInt();  // Cycle two
//            int n = in.nextInt();  // Cycle three
//
//            // Call on the printMe method with the read values of a, b, and n
//            printMe(a, b, n);
//        }
//
//        // This isn't always needed but in this drill we close the Scanner object to release resources
//        in.close();
//    }
//
//    // Method to print the series for given values of a, b, and n
//    private static void printMe(int a, int b, int n) {
//        // Initialize the sum to the value of a
//        int sum = a;
//
//        // Looping through each of the terms in the series
//        for (int i = 0; i < n; i++) {
//            // Calculating what the next term will be in the series using the formula: sum = a + 2^i * b
//            sum += Math.pow(2, i) * b;
//
//            // What the current cycle of the series followed by a space
//            System.out.print(sum + " ");
//        }
//
//        // Move to the next line after printing all the terms of the series for the current query
//        System.out.println();
//    }
//}
//
//
////Input (stdin)
////2
////        0 2 10
////        5 3 5
////Your Output (stdout)
////2 6 14 30 62 126 254 510 1022 2046
////        8 14 26 50 98
////Expected Output
////2 6 14 30 62 126 254 510 1022 2046
////        8 14 26 50 98


import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintCorrespondingSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        IntStream.range(0, t).forEach(i -> {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);
        });

        in.close();
    }

    private static void printSeries(int a, int b, int n) {
        final int[] sum = {a};
        IntStream.range(0, n).forEach(i -> {
            sum[0] += Math.pow(2, i) * b;
            System.out.print(sum[0] + " ");
        });
        System.out.println();
    }
}
