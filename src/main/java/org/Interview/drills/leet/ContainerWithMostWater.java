package org.Interview.drills.leet;

public class ContainerWithMostWater {

//    public int maxArea1(int[] height) {
//
////        int i = 0;
////        int[] hight  = new int[]{};
////        int[] low = new int[]{};
////
////        while (i < height.length()) {
////            for
////        }
//return maxArea1;
//
//
//    }



//        ToDo use this to calculate a rectangle
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;


        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }



    // ToDo fix this so that is works
    public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }
        return maxArea;

    }



}
