package org.Interview.drills.leet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchesTest {

    @Test
    public void testSearch_Exists() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_NotExists() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_FirstElement() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 1;
        int expected = 0;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_LastElement() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int expected = 4;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_MiddleElement() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int expected = 2;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_AllSameElement() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {2, 2, 2, 2, 2};
        int target = 2;
        int expected = 2;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_EmptyArray() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {};
        int target = 5;
        int expected = -1;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_SingleElementArray_TargetPresent() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {10};
        int target = 10;
        int expected = 0;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_SingleElementArray_TargetNotPresent() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = {10};
        int target = 5;
        int expected = -1;
        assertEquals(expected, binarySearches.search(nums, target));
    }

    @Test
    public void testSearch_LargeArray_TargetPresent() {
        BinarySearches binarySearches = new BinarySearches();
        int[] nums = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int target = 999999;
        int expected = 999999;
        assertEquals(expected, binarySearches.search(nums, target));
    }
}
