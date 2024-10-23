package org.shiv.bit_manipulation;

public class IthBitSet {
    public static boolean ifIthBitIsSetUsingLeftShift(int num,int i){
        // brute force convert to binary and check the ith bit
        // 1 << i will give 1 at the ith place e.g. 1<<2 100 in boolean
        // then if we do and with given number and ith index of given number is non-zero
        // then we get a number otherwise we get a zero
        if ((num & (1 << i)) != 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean ifIthBitIsSetUsingRightShift(int num,int i){
        // brute force convert to binary and check the ith bit
        // num >> i will give 1 at the first index e.g. 13 >> 2 = 0011
        // then if we do and with 1 if we 1 as output bit is there otherwise not present
        // then we get a number otherwise we get a zero
        if (((num >> i) & 1) == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
