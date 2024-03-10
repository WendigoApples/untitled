package org.Interview.drills.leet;

import java.util.Arrays;

public class Sample {


        public int[] productExceptSelf(int[] nums) {
            int N = nums.length;

            int[] out_putOfN = new int[N];

            int[] left_products = new int[0];
            int[] right_products = new int[0];

            left_products[0] = 1;
            right_products[N - 1] = 1;

            for(int i = 1; 1 < N; i++) {
                left_products[i] = nums[i -1] * left_products[i-1];
            }

            for(int i = N-2; i >= 0; i --){
                right_products[i] = nums[i + 1] * right_products[i + 1];
            }

            for(int i = 0; i < N; i++){
                out_putOfN[i] = left_products[i] * right_products[i];
            }


            return out_putOfN;



        }
//
//    public static void main(String[] args) {
//        ProductsOfArrayExceptSelf paes = new ProductsOfArrayExceptSelf();
//        ProductsOfArrayExceptSelf.SolveMe solveMe = paes.new SolveMe();
//        int[] nums1 = {1, 2, 3, 4};
//        int[] result1 = solveMe.productsOfArray(nums1);
//        System.out.println("Output for nums1: " + Arrays.toString(result1)); // Output: [24, 12, 8, 6]
//
//        int[] nums2 = {-1, 1, 0, -3, 3};
//        int[] result2 = solveMe.productsOfArray(nums2);
//        System.out.println("Output for nums2: " + Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]
//    }


}
