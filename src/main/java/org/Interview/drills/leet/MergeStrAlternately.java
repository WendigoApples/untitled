package org.Interview.drills.leet;

import java.util.stream.IntStream;

public class MergeStrAlternately {

        public String mergeAlternately(String word1, String word2) {

            int m = word1.length(),
                    n = word2.length();

            // Store combined string in results
            StringBuilder result = new StringBuilder();


            IntStream.range(0, Math.max(m, n))
                    .forEach(i -> {
                        if (i < m) {
                            result.append(word1.charAt(i));
                        }
                        if (i < n) {
                            result.append(word2.charAt(i));
                        }
                    });

            return result.toString();
        }

    public static void main(String[] args) {
        MergeStrAlternately mergeStr = new MergeStrAlternately();

        // testing
        String word1 = "root",
                word2 = "candyCorn";

        String merged = mergeStr.mergeAlternately(word1, word2);
        System.out.println("This is your merged string: " + merged);
    }



}
