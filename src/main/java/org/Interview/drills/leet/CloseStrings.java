package org.Interview.drills.leet;

import java.util.*;

public class CloseStrings {

//    Time com: Ologn * n

    public boolean similarStrings(String word1, String word2) {

        if ( word1.length() != word2.length()) {
            return false;
        }
//    Store values after looping
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

//        Phase 1
        for(int c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }

        for(int c : word2.toCharArray()) {
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }

//        Phase 2
        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        List<Integer> word1FrenquencyList = new ArrayList<>();
        List<Integer> word2FrenquencyList = new ArryList<>();

        Collections.sort(word1FrenquencyList);
        Collections.sort(word2FrenquencyList);

        return word1FrenquencyList.equals(word2FrenquencyList);

    }

}
