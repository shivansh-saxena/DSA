package org.shiv.bit_manipulation;

public class SwapNumbers {
    public static void swapNumbers(int a, int b){
        //XOR comes in picture
        //even number of inputs on xor negates the operation i.e. a^a = 0 left
        a = a ^ b; // will have both a, b
        b = a ^ b; // will negate b and will have a
        a = a ^ b; // will negate a and will have b
    }
}
