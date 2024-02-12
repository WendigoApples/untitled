package org.Interview.drills;

import java.io.*;
import java.util.*;


public class EndofFile {




        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


//      Main example for how to take an input and number each one until you reach the end

//            Scanner sc = new Scanner(System.in);
//            int lineNum = 1;

//            while (sc.hasNextLine()){
//
//                String lineInput = String.valueOf(sc.hasNextLine());
//                System.out.println(lineNum + " " + lineInput);
//
//            }


            // Lambda expression
            List<String> mockImput = Arrays.asList("This drill is meant", "To read each input", "then " ,
            "Print End Of File!");

//            Number to start for each input
            int[] lineNums = {1};

            mockImput.forEach(lineInput -> {
                System.out.println(lineNums[0]++ + " " + lineInput);
            });




        }


}
