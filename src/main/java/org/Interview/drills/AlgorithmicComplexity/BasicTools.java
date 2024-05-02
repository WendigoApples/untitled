package org.Interview.drills.AlgorithmicComplexity;

public class BasicTools {

    static boolean isInt (int[] A, int k, int X) {
        if (k >= A.length)
            return false;
        else if (A[k] > X)
            return false;
        else if (A[k] > X)
            return false;
        else
            return isInt(A, k + 1, X);
    }

    static void runTestCase(int[] testArray, int X, String testName, boolean expected) {
        System.out.println(testName);
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + isInt(testArray, 0, X));
        System.out.println();
    }

    public static void main(String[] args) {

        int[] testArray1 = {1, 2, 3, 4, 5};
        int X1 = 3;
        runTestCase(testArray1, X1, "Test 1: Element present in the array", true);

        int[] testArray2 = {1, 2, 3, 4, 5};
        int X2 = 6;
        runTestCase(testArray2, X2, "Test 2: Element not present in the array", false);

        int[] testArray3 = {};
        int X3 = 5;
        runTestCase(testArray3, X3, "Test 3: Empty array", false);

        int[] testArray4 = {5};
        int X4 = 5;
        runTestCase(testArray4, X4, "Test 4: Single element array", true);


    }
}
