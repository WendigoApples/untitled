package org.Interview.drills.texAdventure.leet;

import org.Interview.drills.leet.IndexPivot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IndexPivotTest {

    @Test
    public void testPivotIndexExample1() {
        IndexPivot indexPivot = new IndexPivot();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int actual = indexPivot.pivotIndex(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testPivotIndexExample2() {
        IndexPivot indexPivot = new IndexPivot();
        int[] nums = {1, 2, 3};
        int expected = -1;
        int actual = indexPivot.pivotIndex(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testPivotIndexExample3() {
        IndexPivot indexPivot = new IndexPivot();
        int[] nums = {2, 1, -1};
        int expected = 0;
        int actual = indexPivot.pivotIndex(nums);
        assertEquals(expected, actual);
    }
}

