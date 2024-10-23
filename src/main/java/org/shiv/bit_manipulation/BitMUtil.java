package org.shiv.bit_manipulation;

public class BitMUtil {
    /*
    ()10 is decimal
    ()2 is binary
    to convert decimal to binary we start dividing by 2

    to convert binary to decimal, we start from right and move to left
    indexing starts with 0 goes like, 0 1 2 3
    we multiply each bit with 2 power index of bit and then su all
     */
    public static String convertToBinary(int num){
        String ans = "";
        while (num != 0){
            int rem = num % 2;
            if(rem == 1){
                ans = "1" + ans;
            }
            else {
                ans = "0" + ans;
            }
            num/=2;
        }
        return ans;
    }
    public static int convertToDecimal(String input){
        int n = input.length();
        int ans = 0;
        int pow2 = 1;
        for (int i=n-1;i>=0;i--){
//            converting char number to integer
//            int numAtChar = input.charAt(i) - '0';
//            ans = ans + ((input.charAt(i)=='1') ? (int)Math.pow(2,n-i-1) : 0);
//            without using Math . pow
            ans = ans + ((input.charAt(i)=='1') ? pow2 : 0);
            pow2 = pow2*2;
        }
        return ans;
    }
    /*
    1s compliment
    flip all 0 to 1 and all o to one
    e.g. decimal 13 = 1101 binary = 0010 1s compliment

    2s compliment
    find 1s compliment and add 1 to it
    e.g. decimal 13 = 1101
         1s compliment  = 0010
         add 1          =+0001
         2s compliment  = 0011 -> this is binary addition
     */

    /*
    AND operator:
    true    &   true    = true
    false   &   false   = false
    true    &   false   = false
    false   &   true    = false

    all true is true
    1 false is false

    e.g. 13 & 7
                1101
              & 0111
             =  0101 = 5 in decimal
     */

    /*
    OR operator:
    true    |   true    = true
    false   |   false   = false
    true    |   false   = true
    false   |   true    = true

    all false is false
    1 true is true

    e.g. 13 | 7
                1101
              | 0111
             =  1111 = 15 in decimal
     */

    /*
    XOR operator:
    true    ^   true    = false
    false   ^   false   = true
    true    ^   false   = true
    false   ^   true    = true

    number of 1s is odd  -> 1
    number of 1s is even -> 0
    e.g. 13 ^ 7
                1101
              ^ 0111
             =  1010 = 10 in decimal
     */

    /*
    SHIFT operator:

    Right Shift >>
    Written as X >> K
    X = Decimal of binary number
    K = number of shifts

    e.g. 13 >> 1
           *
        1101
    =    110 = 6 -> we remove one digit
    e.g. 13 >> 2
          **
        1101
    =     11 = 3 -> we remove two digit

    There is a formula for direct decimal number i.e. X >> K = X/(2 power K)
    This can be proved if we write binary in decimal breakup
    e.g. 13 = 1101 = 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0
    divide by 2^1 for 13 >> 1
    We get 1*2^2 + 1*2^1 + 0*2^0 + 1*2^-1 = 4 + 2 + 0 + 0 = 6
     */

    /*
    How does integer store negative numbers?
    e.g. num = -13
    ANS: 31st bit or the left most bit is reserved for sign
         So if 31st bit is 0 that represents positive number
         For negative number computer internally does a 2s compliment on positive number
         S0 -13 is stored as 111111----------0011

    What is largest possible value of integer?
    ANS: We store 0 on left most bit for positive and all other bits are 1
         So Number is 2^30 + 2^29 + 2^28 ---------- + 2^0 = 2^31 -1 = Integer.MAX_VALUE

    What is smallest possible value of integer?
    ANS: We store 1 on sign bit and all other bits are 0
         This is outcome of doing 2s compliment on 2^31
     */

    /*
    SHIFT operator:

    Left Shift <<
    Written as X << K
    X = Decimal of binary number
    K = number of shifts

    e.g. 13 << 1
        *
        0000-----1101
    =   000-----11010 = 26 -> we remove one digit from left and shift everything to left and add a zero at end
    e.g. 13 << 2
        **
        0000-----1101
    =   00-----110100 = 52 -> we remove two digit from left and shift everything to left and add a zero at end

    There is a formula for direct decimal number i.e. X << K = X * (2 power K)
    This can be proved if we write binary in decimal breakup
    e.g. 13 = 1101 = 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0
    multiply by 2^1 for 13 >> 1
    We get 1*2^4 + 1*2^3 + 0*2^2 + 1*2^1 = 16 + 8 + 0 + 2 = 26

    Q: What if we do it on Int-Max i.e. (2^31-1)
    ANS:  This will be a case of overflow.
     */

    /*
    NOT Operator (~)
    1. Flip Bits of what/how computer stores the number
    2. Check if flipped bits give a negative number
        2a. If negative do 2s compliment
        2b. If not negative Stop

    A positive number will go through step 2a
    e.g. ~ (5)
    First bit is signed bit.
    Signed bit
    00000----101
            Signed bit is also flipped and made 1
    1. Flip 11111----010
    2. Is negative(as signed bit is flipper)
        2a. 2s compliment i.e. 1s compliment + 1
            10000----101 + 1 = 10000----110 = (-6)

    e.g. ~ (-6)
    -6 is negative, so it is 2s compliment(because that is how computer stores the numbers) of 6(110)
    i.e. 1s compliment + 1 with signed bit as 1
         1111-----11001+1 = 1111----11010
    First bit is signed bit.
    Signed bit
    1111----11010
            Signed bit is also flipped and made 1
    1. Flip 0000----00101
    2. Is positive(as signed bit is flipper)
        2b. Stop 0000----00101 = 5
     */
}
