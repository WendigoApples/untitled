package org.Interview.drills;

import java.util.*;
import java.io.*;
public class PrintCorrespondingSeries {


// we use the integers a,b, and n to create the follwing series

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            // Each cycle that this will move into
            int a = in.nextInt();  // Cycle One
            int b = in.nextInt();  // Cycle two
            int n = in.nextInt();  // Cycle three

// wrong
////  Frist we must print this out for the series that the current state of the query
//            for ( int x = 0; x < n; n++) {
//                int cycle = a; // We must start with the Cycle one
//                for(int f = 0; f <= n; f++) {
//                    cycle += Math.pow(2, f) * b;
//                }
//                System.out.println(cycle + " ");
//            }
//            System.out.println();
            printSeries(a, b, n);
        }
        in.close();
    }
//    private static void printSeries(int a, int b, int n) {
//        int term = a;
//        for (int j = 0; j < n; j++) {
//            term += (int)Math.pow(2, j) * b;
//            System.out.print(term + " ");


        }
//        System.out.println();
    }
}



}

