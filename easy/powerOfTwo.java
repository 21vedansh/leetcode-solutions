public class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n == 0 || n < 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]) {
        int n = 1024;
        System.out.println(isPowerOfTwo(n));
    }
}