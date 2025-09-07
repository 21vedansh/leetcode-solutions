public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n > 0) { // while n is greater than zero.
            if((n & 1) != 0) count++; // check if the LSB is non zero(1), if yes increment in count variable.
            n = n >> 1; // right shift by 1 bit every time.
        }
        return count;
    }
    public static void main(String args[]) {
        int n = 11; // binary: 1011 -> 3 set bits.
        System.out.println(hammingWeight(n)); // output: 3
    }
}