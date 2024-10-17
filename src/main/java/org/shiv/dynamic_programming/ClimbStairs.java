package org.shiv.dynamic_programming;

import java.util.Arrays;

public class ClimbStairs {
    public int climbStairs(int n) {
        int[] dpArray = new int[n];
        Arrays.fill(dpArray,-1);
        return dpClimbStairs(n,dpArray);
    }

    public int dpClimbStairs(int n, int[] dpArray) {
        if(n < 3){
            return n;
        }
        if(dpArray[n-1] != -1){
            return dpArray[n-1];
        }
        return dpArray[n-1] = dpClimbStairs(n-1,dpArray) +dpClimbStairs(n-2,dpArray);
    }

    public static void main(String[] args) {
        int n = 4;
        ClimbStairs stairs = new ClimbStairs();
        System.out.println(stairs.climbStairs(n));
    }
}
