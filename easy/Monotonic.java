public class Monotonic {
    public static boolean isMonotonic(int[] nums) {
        boolean flag = false;
        for(int i = 0 ; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                flag = true;
                break;
            }
            if(nums[i] > nums[i+1]) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums));
    }
}