public class pow {
    public static double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }
        return powerFast(x, N);
    }
    public static double powerFast(double x, long N) {
        if(N == 0) {
            return 1.0;
        }
        double halfPower = myPow(x, (int)(N/2));
        if(N % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
    public static void main(String args[]) {
        System.out.println(myPow(2, 10));
    }
}