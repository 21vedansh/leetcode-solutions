import java.util.*;
public class NextGreaterElementll {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);

        for(int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];

            while(!s.isEmpty() && s.peek() <= num) {
                s.pop();
            }

            if(i < n) {
                if(!s.isEmpty()) {
                    res[i] = s.peek();
                }
            }

            s.push(num);
        }
        return res;
    }
    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 1};
        printArray(nextGreaterElements(nums));        
    }
}