public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n == 1) return 1;

        int oneStep = 1;
        int twoStep = 2;
        
        for(int i = 3; i <= n; i++) {
            int current = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = current;
        }
        return twoStep;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}