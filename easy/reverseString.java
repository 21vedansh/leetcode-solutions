public class reverseString {
    public static void toReverseString(char[] s) {
        int n = s.length;
        for(int i = 0; i < (n/2); i++) {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
    }
    public static void printCharArray(char[] s) {
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
    public static void main(String args[]) {
        char[] s = {'v', 'e', 'd', 'a', 'n', 's', 'h'};
        toReverseString(s);
        printCharArray(s);
    }
}