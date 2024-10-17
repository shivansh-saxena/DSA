package org.shiv.sorting;

public class SortingUtil {
    public static void swapArrayElements(int[] inputArray, int index1,int index2){
        int tmp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = tmp;
    }
}
