package org.shiv.dynamic_programming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int[] dpArray = new int[n];
        int[] answer = new int[n];
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        for (int i=0;i<n;i++){
            answer[i] = fibonacciSeries.recurFib(i);
        }
        System.out.println("Fibonacci Series of "+n+" elements: ");
        DpUtil.printArray(answer);
    }
    int recurFib(int n){
        if(n<=1){
            return n;
        }
        return recurFib(n-1) + recurFib(n-2);
    }
}
