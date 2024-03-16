package org.Interview.drills.leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class FindMaxVowels {

    public int maxVowel(String s, int k) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;

        for(int i = 0; i < k; i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }

        int ans = count;
        for(int i = k; i < s.length();  i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            ans = Math.max(ans, count);
        }
        return ans;
    }


    public int maxVowelHashMap(String s, int k) {
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        int count = 0;
        for(int i = 0; i < k; i++){
            if(vowel.contains(s.charAt(i))){
                count++;
            }
        }

        int maxVowel = count;

        for(int i = k; i < s.length(); i++) {
            if(vowel.contains(s.charAt(i - k))) count--;
            if(vowel.contains(s.charAt(i))) count++;
            maxVowel = Math.max(maxVowel, count);
        }
        return maxVowel;
    }





    public static void main(String[] args) {

        FindMaxVowels host = new FindMaxVowels();
        // Test examples
        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println("Example 1:");
        System.out.println("Input: s = \"" + s1 + "\", k = " + k1);
        System.out.println("Output: " + host.maxVowelHashMap(s1, k1));
        System.out.println("Expected: 3\n");

        String s2 = "aeiou";
        int k2 = 2;
        System.out.println("Example 2:");
        System.out.println("Input: s = \"" + s2 + "\", k = " + k2);
        System.out.println("Output: " + host.maxVowelHashMap(s2, k2));
        System.out.println("Expected: 2\n");

        String s3 = "DeepCoder";
        int k3 = 3;
        System.out.println("Example 3:");
        System.out.println("Input: s = \"" + s3 + "\", k = " + k3);
        System.out.println("Output: " + host.maxVowelHashMap(s3, k3));
        System.out.println("Expected: 2\n");
    }


}

//
//Example 1:
//
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.
//Example 2:
//
//Input: s = "aeiou", k = 2
//Output: 2
//Explanation: Any substring of length 2 contains 2 vowels.
//        Example 3:
//
//Input: s = "leetcode", k = 3
//Output: 2
//Explanation: "lee", "eet" and "ode" contain 2 vowels.
//
//
//        Constraints:
//
//        1 <= s.length <= 105
//s consists of lowercase English letters.
//        1 <= k <= s.length
