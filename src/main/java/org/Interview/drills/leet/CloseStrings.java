package org.Interview.drills.leet;

import java.util.*;

public class CloseStrings {

//    Time com: Ologn * n

    public boolean similarStrings(String word1, String word2) {

        // Check if the inputs are not the same lenght then end
        if(word1.length() != word2.length()){
            return false;
        }

//    Store values after looping
        Map<Character, Integer> wordMap1 = new HashMap<>();
        Map<Character, Integer> wordMap2 = new HashMap<>();

//        Phase 1
        for(char c : word1.toCharArray()) {
            wordMap1.put(c, wordMap1.getOrDefault(c, 0) + 1);
        }

        for(char c : word2.toCharArray()) {
            wordMap2.put(c, wordMap2.getOrDefault(c, 0) + 1);
        }

//        Phase 2
        if(!wordMap1.keySet().equals(wordMap2.keySet())){
            return false;
        }


        List<Integer> frequentWordList1 = new ArrayList<>(wordMap1.values());
        List<Integer> frequentWrodList2 = new ArrayList<>(wordMap2.values());


        Collections.sort(frequentWordList1);
        Collections.sort(frequentWrodList2);

        return frequentWordList1.equals(frequentWrodList2);

    }

    public static void main(String[] args) {

        public static void main(String[] args) {
            String word1 = "abc";
            String word2 = "bca";
            CloseStrings solution = new CloseStrings();
            boolean result = solution.similarStrings(word1, word2);
            System.out.println("Example 1: " + result);

            word1 = "a";
            word2 = "aa";
            result = solution.similarStrings(word1, word2);
            System.out.println("Example 2: " + result);

            word1 = "cabbba";
            word2 = "abbccc";
            result = solution.similarStrings(word1, word2);
            System.out.println("Example 3: " + result);
        }

    }

}
