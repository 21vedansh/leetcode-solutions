public class firstLastSortArray {
    public static int[] searchRange(int[] nums, int target) {
        int first = findIdx(nums, target, true);
        int last = findIdx(nums, target, false);
        return new int[] {first, last};
    }
    public static int findIdx(int nums[], int target, boolean firstHalf) {
        int start = 0, end = nums.length-1;
        int res = -1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) {
                res = mid;
                if(firstHalf) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
    public static void displayArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int result[] = searchRange(nums, target);
        displayArray(result);
    }
}