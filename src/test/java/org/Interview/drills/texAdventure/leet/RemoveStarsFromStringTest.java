package org.Interview.drills.texAdventure.leet;

import org.Interview.drills.leet.RemoveStarsFromString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveStarsFromStringTest {

    @Test
    public void testRemoveStars() {
        RemoveStarsFromString remover = new RemoveStarsFromString();

        // Test Case 1: Input with no stars
        String input1 = "hello";
        String expected1 = "hello";
        assertEquals(expected1, remover.removeStars(input1));

        // Test Case 2: Input with only one star
        String input2 = "hello*";
        String expected2 = "hello";
        assertEquals(expected2, remover.removeStars(input2));

        // Test Case 3: Input with multiple stars
        String input3 = "**hello***";
        String expected3 = "hello";
        assertEquals(expected3, remover.removeStars(input3));

        // Test Case 4: Input with leading stars
        String input4 = "***hello";
        String expected4 = "hello";
        assertEquals(expected4, remover.removeStars(input4));

        // Test Case 5: Input with trailing stars
        String input5 = "hello***";
        String expected5 = "hello";
        assertEquals(expected5, remover.removeStars(input5));

        // Test Case 6: Input with alternating stars and characters
        String input6 = "h*e*l*l*o*";
        String expected6 = "hello";
        assertEquals(expected6, remover.removeStars(input6));

        // Test Case 7: Input with special characters and stars
        String input7 = "*h*e*l*l*o*";
        String expected7 = "hello";
        assertEquals(expected7, remover.removeStars(input7));

        // Test Case 8: Input with all stars
        String input8 = "*****";
        String expected8 = "";
        assertEquals(expected8, remover.removeStars(input8));

        // Test Case 9: Input with empty string
        String input9 = "";
        String expected9 = "";
        assertEquals(expected9, remover.removeStars(input9));

        // Test Case 10: Input with a single star
        String input10 = "*";
        String expected10 = "";
        assertEquals(expected10, remover.removeStars(input10));
    }
}


