public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int revNum = 0;
        while(x > 0) {
            int lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x /= 10;
        }
        if(revNum == temp) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}