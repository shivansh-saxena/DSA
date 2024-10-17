package org.shiv.dynamic_programming;

import java.util.Arrays;

public class DpUtil {
    public static void initArray(int[] inputArray){
        Arrays.fill(inputArray , -1);
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(i == n-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i]+" , ");
            }
        }
    }
}
