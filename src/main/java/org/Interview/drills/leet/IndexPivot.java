package org.Interview.drills.leet;

public class IndexPivot {

    public int pivotIndex(int[] nums) {

        int sum = 0;
        int ls = 0;
        int n = nums.length;

//        adding up all the sums
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
//        moving throgh the array until the halfway point
        for (int i = 0; i < nums.length; i++) {
            if(i != 0) ls += nums[i - 1];
            if(sum - ls - nums[i] == ls) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }


}
