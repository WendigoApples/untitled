package org.Interview.drills.leet.arraysAndMore;

public class BitWiseMe {


    public static void main(String[] args) {


        int a = 25;  // 11001
        int b = 15;  // 01111
                     // 01001  -> 9

        int c = a & b;
        System.out.println(c);

        int number = 10;
        int shiftNum = number >>> 2;

        System.out.println(shiftNum);

    }
}
