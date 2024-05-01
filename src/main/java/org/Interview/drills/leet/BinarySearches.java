package org.Interview.drills.leet;

public class BinarySearches {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int med = left + (right - left) / 2;

            if (nums[med] == target) {
                return med;
            }
            if (nums[med] < target) {
                left = ++med;
            } else {
                right = --med;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;

        BinarySearches binarySearches = new BinarySearches();

        // Example 1
        int result1 = binarySearches.search(nums1, target1);
        System.out.println("Example 1:");
        System.out.println("Input: nums = " + java.util.Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + result1);
        System.out.println("Explanation: " + (result1 != -1 ? target1 + " exists in nums and its index is " + result1 : target1 + " does not exist in nums so return -1"));

        // Example 2
        int result2 = binarySearches.search(nums2, target2);
        System.out.println("\nExample 2:");
        System.out.println("Input: nums = " + java.util.Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + result2);
        System.out.println("Explanation: " + (result2 != -1 ? target2 + " exists in nums and its index is " + result2 : target2 + " does not exist in nums so return -1"));
    }

}
