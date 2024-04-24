package org.Interview.drills.leet;

import java.util.Arrays;

public class StringCompressionTest {

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();

        // Test case 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("Test Case 1:");
        System.out.println("Input: " + Arrays.toString(chars1));
        int result1 = stringCompression.compress(chars1);
        System.out.println("Expected Output: 6, and the first 6 characters of the input array should be: [a, 2, b, 2, c, 3]");
        System.out.println("Actual Output: " + result1 + ", and the first " + result1 + " characters of the input array are: " + Arrays.toString(Arrays.copyOf(chars1, result1)));
        System.out.println();

        // Test case 2
        char[] chars2 = {'a'};
        System.out.println("Test Case 2:");
        System.out.println("Input: " + Arrays.toString(chars2));
        int result2 = stringCompression.compress(chars2);
        System.out.println("Expected Output: 1, and the first 1 character of the input array should be: [a]");
        System.out.println("Actual Output: " + result2 + ", and the first " + result2 + " character of the input array is: " + Arrays.toString(Arrays.copyOf(chars2, result2)));
        System.out.println();

        // Test case 3
        char[] chars3 = {'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("Test Case 3:");
        System.out.println("Input: " + Arrays.toString(chars3));
        int result3 = stringCompression.compress(chars3);
        System.out.println("Expected Output: 6, and the first 6 characters of the input array should be: [a, 3, b, 3, c, 3]");
        System.out.println("Actual Output: " + result3 + ", and the first " + result3 + " characters of the input array are: " + Arrays.toString(Arrays.copyOf(chars3, result3)));
        System.out.println();

        // Test case 4
        char[] chars4 = {'a', 'b', 'c'};
        System.out.println("Test Case 4:");
        System.out.println("Input: " + Arrays.toString(chars4));
        int result4 = stringCompression.compress(chars4);
        System.out.println("Expected Output: 3, and the first 3 characters of the input array should be: [a, b, c]");
        System.out.println("Actual Output: " + result4 + ", and the first " + result4 + " characters of the input array are: " + Arrays.toString(Arrays.copyOf(chars4, result4)));
        System.out.println();
    }
}
