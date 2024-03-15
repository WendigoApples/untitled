package org.Interview.drills.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfPairs {


//    Solutions one  O(nlogn)

    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);  // puts numbers in order
        int count = 0;
        int left = 0;
        int right = nums.length - 1;  //

        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                left++;
                right--;
                count++;
            }
        }
        return count;
    }

//    Solution two

    public int maxOperationsHashMap(int[] nums, int k) {

        Map<Integer, Integer> mapper = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if(mapper.containsKey(k - n ) && mapper.get(k - n) > 0) {
                count++;
                mapper.put(k - n, mapper.get(k - n) - 1);
            } else {
                mapper.put(n, mapper.getOrDefault(n,0) + 1);
            }
        }
        return count++;
    }





}
