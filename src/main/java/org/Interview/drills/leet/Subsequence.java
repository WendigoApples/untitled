package org.Interview.drills.leet;

import java.util.Arrays;

public class Subsequence {


//    FixMe
    public boolean isSubsequenceIf(String s, String t) {
        if(s.length() == 0)
            return true;
        if(s.length() == 0)
            return true;
        if(s.charAt(0) == t.charAt(0))
            return isSubsequenceIf(s.substring(1),
                    t.substring(1));
        return isSubsequenceIf(s, t.substring(1));
    }


    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return tIndex == t.length();
    }


    public static void main(String[] args) {
        Subsequence sub = new Subsequence();
        StringCompression checkTheStirng = new StringCompression();

//        String s1 = "abc", t1 = "ahbgdc";
//        boolean test1 = sub.isSubsequence(s1, t1);
//
//        String s2 = "axc", t2 = "ahbgdc";
//        boolean test2 = sub.isSubsequence(s2, t2);
//
//        System.out.println(test1);
//        System.out.println(test2);

        // ToDo study this more Example 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("Example 1: Input chars1 = " + Arrays.toString(chars1));
        int result1 = checkTheStirng.compress(chars1);
        System.out.println("Output: " + result1 + ", and the first " + result1 + " characters of the input array should be: " + Arrays.toString(chars1));

        // Example 2
        char[] chars2 = {'a'};
        System.out.println("\nExample 2: Input chars2 = " + Arrays.toString(chars2));
        int result2 = checkTheStirng.compress(chars2);
        System.out.println("Output: " + result2 + ", and the first " + result2 + " character of the input array should be: " + Arrays.toString(chars2));

        // Example 3
        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println("\nExample 3: Input chars3 = " + Arrays.toString(chars3));
        int result3 = checkTheStirng.compress(chars3);
        System.out.println("Output: " + result3 + ", and the first " + result3 + " characters of the input array should be: " + Arrays.toString(chars3));
    }

}
