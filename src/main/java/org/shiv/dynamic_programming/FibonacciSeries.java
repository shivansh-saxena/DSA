package org.shiv.dynamic_programming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 40;
        int[] dpArray = new int[n];
        DpUtil.initArray(dpArray);
        int[] answer = new int[n];
        int[] answer2 = new int[n];
        int[] answer3;
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
        System.out.println("\nTime consumed with DP recursion: "+ (endTime2-startTime2)/1000+" ms");

        long startTime3 = System.nanoTime();
        answer3 = fibonacciSeries.dpTabulationRecurFib(n);
        long endTime3 = System.nanoTime();
        System.out.println("\nFibonacci Series of "+n+" elements: ");
        DpUtil.printArray(answer3);
        System.out.println("\nTime consumed with Tabulation DP recursion: "+ (endTime3-startTime3)/1000+" ms");

        System.out.println("\nFibonacci Series of "+n+" elements: ");
        long startTime4 = System.nanoTime();
        fibonacciSeries.dpTabulationOptimalSpace(n);
        long endTime4 = System.nanoTime();
        System.out.println("\nTime consumed with Tabulation Optimal DP recursion: "+ (endTime4-startTime4)/1000+" ms");

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
        return dpArray[n] = dpRecurFib(n-1, dpArray) + dpRecurFib(n-2, dpArray);
    }
    int[] dpTabulationRecurFib(int n){
        int[] dpArray = new int[n];
        if(n>1){
            dpArray[0] = 0;
            dpArray[1] = 1;
        }
        for (int i=2;i<n;i++){
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }
        return dpArray;
    }
    void dpTabulationOptimalSpace(int n){
        if(n>1){
            System.out.print("0 , 1");
        }
        int prev = 1;
        int prev_prev = 0;
        for (int i=2;i<n;i++){
            int current = prev + prev_prev;
            System.out.print(" , "+current);
            prev_prev = prev;
            prev = current;
        }
    }
}
