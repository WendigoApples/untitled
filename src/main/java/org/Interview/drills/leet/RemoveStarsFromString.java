package org.Interview.drills.leet;

public class RemoveStarsFromString {


    public String removeStars(String s) {
        String ans="";
        int star=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*')
                star++;
            else if(star==0)
                ans=s.charAt(i)+ans;
            else
                star--;
        }
        return ans;
    }

    public static void main(String[] args) {
        RemoveStarsFromString remover = new RemoveStarsFromString();

        // Example 1
        String input1 = "leet**cod*e";
        String result1 = remover.removeStars(input1);
        System.out.println("Example 1: " + result1); // Expected output: "lecoe"

        // Example 2
        String input2 = "erase*****";
        String result2 = remover.removeStars(input2);
        System.out.println("Example 2: " + result2); // Expected output: ""
    }


}
