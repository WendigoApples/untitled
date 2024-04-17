package org.Interview.drills.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAnColumnPairs {

    public int equalPairs( int[] [] grid) {

        int count = 0;
        int n = grid.length;

        Map<String, Integer> rowCounter = new HashMap<>();
        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, rowCounter.getOrDefault(rowString, 0) + 1);
        }

        for(int c = 0; c < n; c++) {
            int[] colArray = new int[n];
            for (int r = 0; r < n; r++) {
                colArray[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(colArray), 0);
        }

        return count;
    }

    public static void main(String[] args) {


        EqualRowAnColumnPairs pairs = new EqualRowAnColumnPairs();
        // Example 1
        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int result1 = pairs.equalPairs(grid1);
        System.out.println("Example 1: " + result1); // Expected output: 1

        // Example 2
        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        int result2 = pairs.equalPairs(grid2);
        System.out.println("Example 2: " + result2); // Expected output: 3
    }
}
