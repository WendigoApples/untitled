package org.Interview.drills.leet;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {

    class SolveMe {
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
    }

    public static void main(String[] args) {
        ProductsOfArrayExceptSelf paes = new ProductsOfArrayExceptSelf();
        SolveMe solveMe = paes.new SolveMe();
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solveMe.productsOfArray(nums1);
        System.out.println("Output for nums1: " + Arrays.toString(result1)); // Output: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solveMe.productsOfArray(nums2);
        System.out.println("Output for nums2: " + Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]
    }
}
