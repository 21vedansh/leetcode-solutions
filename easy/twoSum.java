public class twoSum {
    public static int[] calculateTwoSum(int nums[], int target) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {left, right};
            }
            if(nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String args[]) {
        int nums[] = {2, 7, 11, 15};
        int target = 13;
        int result[] = calculateTwoSum(nums, target);
        if(result.length == 0) {
            System.out.println("no solution exists");
        } else {
            System.out.println(result[0]+" "+result[1]);
        }
    }
}