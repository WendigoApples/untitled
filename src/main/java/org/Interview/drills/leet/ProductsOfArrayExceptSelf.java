package org.Interview.drills.leet;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {

    class SolveMe {

        // First Go
        public int[] productsOfArray(int[] nums) {
            int N = nums.length;

            int[] left_products = new int[N];
            int[] right_products = new int[N];
            int[] output_arr = new int[N];

            left_products[0] = 1;
            right_products[N - 1] = 1;

            for (int i = 1; i < N; i++) {
                left_products[i] = nums[i - 1] * left_products[i - 1];
            }

            for (int i = N - 2; i >= 0; i--) {
                right_products[i] = nums[i + 1] * right_products[i + 1];
            }

            for (int i = 0; i < N; i++) {
                output_arr[i] = left_products[i] * right_products[i];
            }

            return output_arr;
        }


// ToDo ---> Tim Complexity O(n) learn more about this algorithm Auxilary Space is O(1)
        public int[] productExceptSelf(int[] nums) {

            int n = nums.length;
            int ans[] = new int[n];

            Arrays.fill(ans, 1);

            int curr = 1;
            for(int i = 0; i < n; i++) {
                ans[i] *= curr;
                curr *= nums[i];
            }

            curr = 1;
            for(int i = n - 1; i >= 0; i--) {
                ans[i] *= curr;
                curr *= nums[i];
            }
            return ans;
        }

    }

    public static void main(String[] args) {

     // Test 1
        ProductsOfArrayExceptSelf paess = new ProductsOfArrayExceptSelf();
        SolveMe solveMe2 = paess.new SolveMe();
        int[] nums3 = {12, 0, 3, 4, -9, 1};
        int[] result3 = solveMe2.productsOfArray(nums3);
        System.out.println("Output for nums3: " + Arrays.toString(result3)); // Output: [0, -1296, 0, 0, 0, 0]

        int[] nums4 = {-1, 0, 0, 22, 3, 1, 83};
        int[] result4 = solveMe2.productsOfArray(nums4);
        System.out.println("Output for nums4: " + Arrays.toString(result4)); // Output: [0, 0, 0, 0, 0, 0, 0]

// Test 2
        ProductsOfArrayExceptSelf paes = new ProductsOfArrayExceptSelf();
        SolveMe solveMe = paes.new SolveMe();
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solveMe.productExceptSelf(nums1);
        System.out.println("Output for nums1: " + Arrays.toString(result1)); // Output: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solveMe.productExceptSelf(nums2);
        System.out.println("Output for nums2: " + Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]


    }


}
