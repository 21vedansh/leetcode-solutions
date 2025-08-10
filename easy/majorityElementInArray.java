public class majorityElementInArray {
    public static int majorityElement(int[] nums) {
        return majority(nums, 0, nums.length-1);
    }
    public static int majority(int nums[], int si, int ei) {
        if(si == ei) {
            return nums[si];
        }
        int mid = si + (ei-si)/2;
        int leftMajority = majority(nums, si, mid);
        int rightMajority = majority(nums, mid+1, ei);

        if(leftMajority == rightMajority) {
            return leftMajority;
        }

        int leftCount = countInRange(nums, leftMajority, si, ei);
        int rightCount = countInRange(nums, rightMajority, si, ei);

        return leftCount > rightCount ? leftMajority : rightMajority;
    }
    public static int countInRange(int nums[], int target, int si, int ei) {
        int count = 0;
        for(int i = si; i <= ei; i++) {
            if(nums[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int nums[] = {2, 3, 2, 2, 2, 3, 3, 3, 3};
        System.out.println(majorityElement(nums));
    }
}