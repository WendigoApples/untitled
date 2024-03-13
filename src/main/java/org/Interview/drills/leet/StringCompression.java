package org.Interview.drills.leet;

import java.util.Arrays;

public class StringCompression {

    public int compress(char[] chars) {

        // start with empty string
        int ans = 0;

        // for each of consecutive group of reapeating chars
        for(int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            chars[ans++] = letter;

            if(count > 1) {
                for( final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        // look at the current char[i] and count then move to the next object in array
        return ans;
    }

    public static void main(String[] args) {

        StringCompression stringCompression = new StringCompression();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("Example 1: Input chars1 = " + Arrays.toString(chars1));
        int result1 = stringCompression.compress(chars1);
        System.out.println("Output: " + result1 + ", and the first " + result1 + " characters of the input array should be: " + Arrays.toString(chars1));


    }
}
