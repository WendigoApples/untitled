package org.Interview.drills.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompairArray {

//    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//
//        int first = nums1.length;
//        int second = nums2.length;
//
//        int start = 0;
//        int end = 0;
//        int ans = 0;
//
//        // while loop
//        for(int i = 0; i < first; i++){
//            start = nums1[i];
//        }
//        for(int j = 0; j < second; j++) {
//            end = nums2[j];
//        }
//        if (start == end)
//        return ans;
//    }


    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2) {
            set2.add(num);
        }

        List<List<Integer>> listAns = new ArrayList<>();
        listAns.add(new ArrayList<>());
        listAns.add(new ArrayList<>());

//        Checking for any dumbs
        for(int num : set1){
            if(!set2.contains(num)) {
                listAns.get(0).add(num);
            }
        }

        for(int num : set2) {
            if(!set1.contains(num)) {
                listAns.get(1).add(num);
            }
        }
        return listAns;

    }



    public List<List<Integer>> findDifference3(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
            System.out.printf("Num is: %d\n  Nums1 is: %s%n", num, nums1);
        }
        for (int num : nums2) {
            set2.add(num);
            System.out.println("Num is: " + num + "\n " + " Nums2 is: " + nums2);
        }

        List<List<Integer>> listAns = new ArrayList<>(2);

        listAns.add(new ArrayList<>(set1));
        listAns.add(new ArrayList<>(set2));

        // Retain only the differences in the lists
        listAns.get(0).removeAll(set2);
        listAns.get(1).removeAll(set1);

        return listAns;
    }






}
