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


    public int equalPairs2(int[] [] grid) {
        Map<String, Integer> counter = new HashMap<>();
        for (int[] row : grid) {
            counter.merge(Arrays.toString(row), 1, Integer::sum);
        }

        int pairs = 0;
        for (int c = 0, n = grid.length; c < n; ++c) {
            int[] col = new int[n];
            for (int r =0; r < n; ++r) {
                col[r] = grid[r][c];
            }
            pairs += counter.getOrDefault(Arrays.toString(col), 0);
        }

        return pairs;
    }


    public int equalPairs3(int[] [] grid) {
        int count = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int[] n = new int[grid[0].length];
            int s = 0;

            for (int[] row : grid) {
                n[s]  = row[i];
                s++;
            }

            for (int[] row : grid) {
                if (Arrays.equals(n, row)) count++;
            }
        }
        return count;
    }


    public int equalPairs4(int[][] grid) {
        int results = 0, n = grid.length;
        HashMap<String, Integer> x = new HashMap<>();
        HashMap<String, Integer> y = new HashMap<>();

        for (int i = 0; i < n; i++){
            StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
            for (int j = 0; j < n; j++){
                sb1.append(grid[i][j]);
                sb2.append(grid[j][i]);
                sb1.append(','); sb2.append(',');
            }
            String curr1 = sb1.toString(), curr2 = sb2.toString();
            x.put(curr1, x.getOrDefault(curr1, 0) + 1);
            y.put(curr2, y.getOrDefault(curr2, 0) + 1);
        }

        for (String str : x.keySet())
            if(y.containsKey(str))
                results += x.get(str) * y.get(str);
        return results;
    }






    public static void main(String[] args) {


        EqualRowAnColumnPairs pairs = new EqualRowAnColumnPairs();
        // Example 1
        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int result1 = pairs.equalPairs3(grid1);
        System.out.println("Example 1: " + result1); // Expected output: 1

        // Example 2
        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        int result2 = pairs.equalPairs3(grid2);
        System.out.println("Example 2: " + result2); // Expected output: 3
    }
}
