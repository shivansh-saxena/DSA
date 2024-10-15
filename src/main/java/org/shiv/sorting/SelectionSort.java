package org.shiv.sorting;

public class SelectionSort implements SortingInterface{

    /**
     * @param inputArr - input array to be sorted
     */
    @Override
    public void sort(int[] inputArr) {
        int n = inputArr.length;
        for(int i=0;i<=n-2;i++){
            int min = i;
            for (int j=i;j<=n-1;j++){
                if(inputArr[j]<inputArr[min]){
                    min = j;
                }
            }
            swapArrayElements(inputArr,min,i);
        }
    }
    public void swapArrayElements(int[] inputArray, int index1,int index2){
        int tmp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = tmp;
    }
}
