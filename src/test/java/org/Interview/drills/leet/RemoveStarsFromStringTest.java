package org.Interview.drills.leet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveStarsFromStringTest {

    @Test
    public void testRemoveStars1() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "leet**cod*e";
        String expected = "lecoe";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars2() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "erase*****";
        String expected = "";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars3() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "*hello*";
        String expected = "hello";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars4() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "hello**";
        String expected = "hello";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars5() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "h*e*l*l*o*";
        String expected = "hello";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars6() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "********";
        String expected = "";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars7() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "";
        String expected = "";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars8() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "*";
        String expected = "";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars9() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "abcde";
        String expected = "abcde";
        assertEquals(expected, remover.removeStars(input));
    }

    @Test
    public void testRemoveStars10() {
        RemoveStarsFromString remover = new RemoveStarsFromString();
        String input = "**";
        String expected = "";
        assertEquals(expected, remover.removeStars(input));
    }
}
