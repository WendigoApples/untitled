package org.Interview.drills.leet;

public class FindSubarray {


    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }

            // If zeroCount exceeds 1, move the start pointer until zeroCount is 1
            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update longestWindow if the current window size is greater
            longestWindow = Math.max(longestWindow, i - start);
        }

        // Edge case: if all elements are 1's, the longest subarray will be nums.length - 1
        if (zeroCount == 0) {
            return nums.length - 1;
        }

        return longestWindow;
    }

    public static void main(String[] args) {
        FindSubarray subarray = new FindSubarray();

        // Test cases
        int[] nums1 = {1, 1, 0, 1,};
        System.out.println("Output for nums1: " + subarray.longestSubarray(nums1)); // Output: 3

        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println("Output for nums2: " + subarray.longestSubarray(nums2)); // Output: 5

        int[] nums3 = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        System.out.println("Output for nums3: " + subarray.longestSubarray(nums3)); // Output: 9
    }






}
