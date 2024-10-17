package org.shiv.dynamic_programming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 40;
        int[] dpArray = new int[n];
        DpUtil.initArray(dpArray);
        int[] answer = new int[n];
        int[] answer2 = new int[n];
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        long startTime1 = System.nanoTime();
        for (int i=0;i<n;i++){
            answer[i] = fibonacciSeries.recurFib(i);
        }
        long endTime1 = System.nanoTime();
        System.out.println("Fibonacci Series of "+n+" elements: ");
        DpUtil.printArray(answer);
        System.out.println("\nTime consumed with recursion: "+ (endTime1-startTime1)/1000+" ms");
        long startTime2 = System.nanoTime();
        for (int i=0;i<n;i++){
            answer2[i] = fibonacciSeries.dpRecurFib(i,dpArray);
        }
        long endTime2 = System.nanoTime();
        System.out.println("\nFibonacci Series of "+n+" elements: ");
        DpUtil.printArray(answer2);
        System.out.println("\nTime consumed with recursion: "+ (endTime2-startTime2)/1000+" ms");

    }
    int recurFib(int n){
        if(n<=1){
            return n;
        }
        return recurFib(n-1) + recurFib(n-2);
    }
    int dpRecurFib(int n, int[] dpArray){
        if(n<=1){
            return n;
        }
        if(dpArray[n] != -1){
            return dpArray[n];
        }
        dpArray[n] = dpRecurFib(n-1, dpArray) + dpRecurFib(n-2, dpArray);
        return dpArray[n];
    }
}
