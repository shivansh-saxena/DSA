package org.shiv.dynamic_programming;

import java.util.Arrays;

public class FrogKJump {
    public int frogJump(int[] heights, int k) {
        int[] dpArray = new int[heights.length];
        Arrays.fill(dpArray,-1);
        return dpFrogJump(0,dpArray,heights,k);
    }

    private int dpFrogJump(int i, int[] dpArray, int[] heights, int k) {
        //base case1: check if index is last element/stair
        if(i >= heights.length-1){
            return 0;
        }
        //check for element being present in memoization array
        if(dpArray[i] != -1){
            return dpArray[i];
        }
        int minValue = Integer.MAX_VALUE;
        //running a loop to find minimum energy for possible paths
        for(int loopVar=1;loopVar<=k;loopVar++){
            int tmp = loopVar + i;
            //ensuring array index is not out of bound
            if(tmp <= heights.length-1){
                minValue = Math.min(minValue, Math.abs(heights[i]-heights[tmp]) + dpFrogJump(tmp, dpArray, heights, k));
            }
        }
        return dpArray[i] = minValue;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{15, 4, 1, 14, 15};
        int k = 4;
        FrogKJump jump = new FrogKJump();
        System.out.println(jump.frogJump(inputArray,k));
    }

}
