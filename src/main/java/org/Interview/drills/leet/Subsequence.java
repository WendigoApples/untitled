package org.Interview.drills.leet;

public class Subsequence {

//    public boolean isSubsequenceIf(String s, String t) {
//
//
//        if(s.length() == 0)
//            return true;
//        if(s.length() == 0)
//            return true;
//        if(s.charAt(0) == t.charAt(0))
//            return isSubsequenceIf(s.substring(1),
//                    t.substring(1));
//        return isSubsequenceIf(s, t.substring(1));
//    }

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

        String s1 = "abc", t1 = "ahbgdc";
        boolean test1 = sub.isSubsequence(s1, t1);

        String s2 = "axc", t2 = "ahbgdc";
        boolean test2 = sub.isSubsequence(s2, t2);

        System.out.println(test1);
        System.out.println(test2);






    }
}
