package org.shiv.dynamic_programming;

import java.util.Arrays;

public class NonAdjacentMaxSum {
    public int nonAdjacent(int[] nums) {
        int[] dpArray = new int[nums.length];
        Arrays.fill(dpArray, -1);
//        int maxValue = Integer.MIN_VALUE;
//        for (int i=0;i<nums.length;i++){
//            maxValue = Math.max(maxValue, dpNonAdjacent(i,nums,dpArray));
//        }
//        return maxValue;
        return dpNonAdjacent(0,nums,dpArray);
    }

//    private int dpNonAdjacent(int cur, int end, int[] stairs, int[] dpArray) {
//        if(cur > stairs.length-1){
//            return 0;
//        }
//        if(cur == stairs.length-1){
//            return stairs[cur];
//        }
//        if(dpArray[cur] != -1){
//            return dpArray[cur];
//        }
//        // 0 1 2 3 4 5 6 7 8 9
//        int left_sum = Integer.MIN_VALUE;
//        for(int i=0;i<cur-2;i++){
//        }
//    }

    private int dpNonAdjacent(int i, int[] nums, int[] dpArray) {
        if(i > nums.length-1){
            return 0;
        }
        if(i == nums.length-1){
            return nums[i];
        }
        if(dpArray[i] != -1){
            return dpArray[i];
        }
        int maxValue = Integer.MIN_VALUE;
        for (int j=i+2;j<nums.length;j++){
            maxValue = Math.max(maxValue,
                    nums[i]+dpNonAdjacent(j,nums,dpArray));
        }
        return dpArray[i] = maxValue;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,7,16,8};
        NonAdjacentMaxSum nonAdjacentMaxSum = new NonAdjacentMaxSum();
        System.out.println(nonAdjacentMaxSum.nonAdjacent(input));
    }
}
