package org.Interview.drills.leet;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ReverseSentence {

//// Frist Go

    static String reverseWordsFirst(String str)
    {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }


//// Take 2  ----> PASS
    static String reverseWordsShort (String s) {
        String[] sentence = s.split(" +"); // " +" do this when the amount of spaces is more than 1
        StringBuilder flex = new StringBuilder();
        for(int i = sentence.length - 1; i>=0; i--) {
            flex.append(sentence[i]);
            flex.append(" ");
        }
        return flex.toString().trim();
    }


//// Take 3

    static String reverseWordsLambda(String s) {
        return Arrays.stream(s.split("\\s+"))// \\s+ use for one or more whitspaces
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("")
                .trim();
    }




    static String reverseWordsShortLAM (String s) {
        String[] sentence = s.split(" +"); // " +" do this when the amount of spaces is more than 1
        StringBuilder flex = new StringBuilder();
        for(int i = sentence.length - 1; i>=0; i--) {
            flex.append(sentence[i]);
            flex.append(" ");
        }
        return flex.toString().trim();
    }



    public static void main(String[] args) {

        String string1 = "the sky is blue    for a     long time        ";
        String string2 = "  hello world  ";
        String string3 = "a good   example";


        System.out.println(reverseWordsLambda(string1));
        System.out.println(reverseWordsLambda(string2));
        System.out.println(reverseWordsLambda(string3));



    }

}
