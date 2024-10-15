package org.shiv.sorting;

public class RunnerClass {
    public static void main(String[] args) {
        int[] inputArray = new int[]{13,46,24,52,20,9};
        SortingInterface selectionSort = new SelectionSort();
        processSortingNPrint(inputArray,selectionSort);
    }
    static void printArray(int[] arr){
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
    static void processSortingNPrint(int[] inputArray, SortingInterface obj ){
        System.out.println("Input Array : ");
        printArray(inputArray);
        System.out.println("\nSorted Array : ");
        obj.sort(inputArray);
        printArray(inputArray);
    }
}
