package org.shiv.dynamic_programming;

import java.util.Arrays;

public class FrogJump {
    public int frogJump(int[] heights) {
        int[] dpArray = new int[heights.length];
        Arrays.fill(dpArray,-1);
        return dpMaxEnergy(0,dpArray,heights);
    }
    public int dpMaxEnergy(int i,int[] dpArray,int[] stairs){
        //base case1: check if index is last element/stair
        if(i>=stairs.length-1){
            return 0;
        }
        //base case2: check if index is second last element/stair
        if(i == stairs.length-2){
            return Math.abs(stairs[i]-stairs[i+1]);
        }
        //check for element being present in memoization array
        if(dpArray[i] != -1){
            return dpArray[i];
        }
        //finding minimum energy path
        //by jumping either 1 stair or 2 stairs
        return dpArray[i] = Math.min(Math.abs(stairs[i]-stairs[i+1])+dpMaxEnergy(i+1,dpArray,stairs),
                Math.abs(stairs[i]-stairs[i+2])+dpMaxEnergy(i+2,dpArray,stairs));
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{7, 5, 1, 2, 6};
        FrogJump jump = new FrogJump();
        System.out.println(jump.frogJump(inputArray));
    }
}
