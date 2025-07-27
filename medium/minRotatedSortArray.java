public class minRotatedSortArray {
    public static int findMin(int nums[]) {
        int start = 0, end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start <= end) {
            int mid = (start + end) / 2;
            min = Math.min(nums[mid], min);

            if(nums[start] <= nums[mid]) {
                min = Math.min(min, nums[start]);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int nums[] = {3, 4, 5, -1, 0, 1, 2};
        System.out.println(findMin(nums));
    }
}