package org.Interview.drills;

public class FizzBuzz {

//    ToDo
//     print 1 .. 100
//    print "Fizz" if divisible by 3
//    print "Buzz" if divisible by 5
//    print "FizzBuzz" if divisible by 3 and 5

//    print "Bazz" if divisible by 7

    public static void main(String[] args) {


        for (int i =1; i <= 100; i++){
            if(i / 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            }
            if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
            if (i % 7 == 0) {
                System.out.println("BaZZ " + i);
            }
        }
    }


}
