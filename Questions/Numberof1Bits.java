/*
 *
 * Write a function that takes the binary representation of an unsigned integer and returns
 *  the number of '1' bits it has (also known as the Hamming weight). 
 */
public class Numberof1Bits {

    /*
     * Subtracting 1 from a decimal number flips all the bits after the rightmost
     * set bit(which is 1) including the rightmost set bit.
     * for example :
     * 10 in binary is 00001010
     * 9 in binary is 00001001
     * 8 in binary is 00001000
     * 7 in binary is 00000111
     * So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)),
     * we unset the rightmost set bit. If we do n & (n-1) in a loop and count the
     * number of times the loop executes, we get the set bit count.
     */

    public static void main(String[] args) {
      System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int count=0;
       while(n!=0){
           n= n&(n-1);
           count++;
       }
       return count;
    }
      
}
