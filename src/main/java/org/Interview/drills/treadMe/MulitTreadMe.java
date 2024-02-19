package org.Interview.drills.treadMe;

public class MulitTreadMe extends Thread{



    private int threadNum;
    public MulitTreadMe (int threadNum) {
        this.threadNum = threadNum;

    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " from the thread " + threadNum);

//            if (threadNum == 3) {
//                throw new RuntimeException("Blowing up! Showing that even if one of the threads blows up it will still contiue to run as normal.");
//            }

            try {
                Thread.sleep(1000);  // waits a second before it does the next
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
