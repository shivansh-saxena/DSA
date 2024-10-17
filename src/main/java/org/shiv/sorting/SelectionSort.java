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
            SortingUtil.swapArrayElements(inputArr,min,i);
        }
    }
}
