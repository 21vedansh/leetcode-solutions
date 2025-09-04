public class FindDuplicateNum {
    public static int findDuplicate(int[] nums) {
        int turtle = 0;
        int hare = 0;
        do {
            turtle = nums[turtle];
            hare = nums[nums[hare]];
        } while(turtle != hare);

        turtle = 0;
        while(turtle != hare) {
            turtle = nums[turtle];
            hare = nums[hare];
        }
        return turtle;
    }
    public static void main(String[] args) {
        int nums[] = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }
}