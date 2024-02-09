package org.Interview.drills;

import java.io.*;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");

// -- Frist run
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                //Complete the code
//                // short
//                if(x >= -32768 && x <= 32767)System.out.println("* short");
//                // Int
//                if(x >= -2147483648 && x <= 2147483647)System.out.println("* int");
//                // long
//                if(x >= -9223372036854775808L && x <= 9223372036854775807L)
//                    System.out.println("* long");


                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }


            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}