package org.Interview.drills.leet.arraysAndMore;


import org.w3c.dom.ls.LSOutput;

public class BinarySearchRotateSortedArray {

    public static int search(int[] nums, int target) {


        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (nums[mid] == target) {
                return mid;
            }

//          check if the lower to mid to be sorted
            if (nums[low] <= nums[mid]) {
                if ( nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
//       Check to see the mid to upper is sorted
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }
        }
        //  When not found we return this value
        return -1;
    }


    public static void main(String[] args) {

        BinarySearchRotateSortedArray pri = new BinarySearchRotateSortedArray();

//  1
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target11 = 0;
//        Output: 4

//  2
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
//        Output: -1

//  3
        int[] nums3 = {1};
        int target3 = 0;
//        Output: -1

        int resultIndex = pri.search(nums, target);

//        System.out.println(resultIndex);

        if (resultIndex != -1) {
            System.out.println("Target " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Target " + target + " not found");
        }




//   ------> Below is the easy way to do it
//        System.out.println(Arrays.binarySearch(nums, target));


    }

}
