package org.Interview.drills.treadMe;

public class Main {

    public static void main(String[] args) {

//---- First way
//        MulitTreadMe threading = new MulitTreadMe();
//        MulitTreadMe mulitTreadMe = new MulitTreadMe();
//
//        threading.start();  // must use start to have
//        mulitTreadMe.start();

        for(int i = 0; i<=3; i++){
            MulitTreadMe threading = new MulitTreadMe(i);
            threading.start();
        }



    }
}
