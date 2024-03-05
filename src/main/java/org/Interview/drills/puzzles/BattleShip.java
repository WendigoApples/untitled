package org.Interview.drills.puzzles;

import java.util.Arrays;
public class BattleShip {

// Main

    public double getHitProbability(int R, int C, int [][] G) {

        // battleShipCout = 0;
        int battleShipCount = 0;
        // move through each cell to see how many ships
        for (int i = 0; i < R; i++)
            for(int j = 0; j < C; j++)
                if(G[i][j] == 1) {
                    battleShipCount++;
        }

       int tottalCells = R * C;
        double hitProbability = (double) battleShipCount / tottalCells;


        return hitProbability;
    }


    public double Ships(int R, int C, int [][] G) {

        // battleShipCout = 0;
        int battleShipCount = 0;
        // move through each cell to see how many ships
        for (int i = 0; i < R; i++)
            for(int j = 0; j < C; j++)
                if(G[i][j] == 1) {
                    battleShipCount++;
                }

        int ships = battleShipCount;


        return ships;
    }





// Refactored
//        public double getHitProbability(int R, int C, int[][] G) {
//            int battleshipCount = Arrays.stream(G)
//                    .flatMapToInt(Arrays::stream)
//                    .sum();
//            int totalCells = R * C;
//            double hitProbability = (double) battleshipCount / totalCells;
//            return hitProbability;
//        }

    public static void main(String[] args) {
        BattleShip bat = new BattleShip();



        int R = 2;
        int C = 3;
        int[][]  G = {
               {0, 0, 1},
               {1, 0, 1}
            };

        double expectedHitProbability = 0.5;

        double actualHitProbability = bat.getHitProbability(R, C, G);
        int totalShips = (int) bat.Ships(R, C, G);

        if (Math.abs(actualHitProbability - expectedHitProbability) < 1e-6) {
            System.out.println("Test Passed: Hit Probability = " + actualHitProbability + " total ships: " + totalShips);
        } else {
            System.out.println("Test Failed: Expected " + expectedHitProbability + ", but got " + actualHitProbability + " total ships: " + totalShips);
        }


    }

}
