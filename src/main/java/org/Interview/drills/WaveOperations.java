package org.Interview.drills;

import java.util.Arrays;

public class WaveOperations {

    // Used to calculate what the average frequency of the waves resulting from superposition
    public double calculateAverageFrequency(double f1, double f2) {
        return (f1 + f2) / 2;
    }

    // For count occurrences of the average frequencies, trying to use the divide and conquer algorithm
    public int countOccurrences(int[] nums, double target, int left, int right) {
        if (left > right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = 0;

        if (nums[mid] == target) {
            count++;
            // Check for occurrences on both sides
            count += countOccurrences(nums, target, left, mid - 1);
            count += countOccurrences(nums, target, mid + 1, right);
        } else if (nums[mid] < target) {
            // Search on the right side
            count += countOccurrences(nums, target, mid + 1, right);
        } else {
            // Search on the left side
            count += countOccurrences(nums, target, left, mid - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        WaveOperations waveOps = new WaveOperations();
        double f1 = 100; // Frequency of first wave
        double f2 = 120; // Frequency of second wave

        // Calculate average frequency
        double averageFrequency = waveOps.calculateAverageFrequency(f1, f2);
        System.out.println("Average Frequency: " + averageFrequency);

        // Example usage of countOccurrences method
        int[] nums = {100, 110, 120, 130, 140, 150, 160};
        double targetFrequency = 125.0; // Example target frequency
        int count = waveOps.countOccurrences(nums, targetFrequency, 0, nums.length - 1);
        System.out.println("Frequency " + targetFrequency + " occurs " + count + " times in the array.");
    }
}

