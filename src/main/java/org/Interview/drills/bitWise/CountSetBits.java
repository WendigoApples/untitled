package org.Interview.drills.bitWise;

public class CountSetBits {

    public CountSetBits() {

        // ToDo call some other methods or constructors


    }


    public int countOnes(int n) {
        int count = 0;
        while  (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {

        CountSetBits counter = new CountSetBits();
        int num = 25;
        int onesCount = counter.countOnes(num);
        System.out.println("The number of set bits in " + num + ":" + onesCount);
    }
}
