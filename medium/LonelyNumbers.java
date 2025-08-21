import java.util.*;
public class LonelyNumbers {
    public static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> lonelyList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            boolean isLonely = true;

            if(i > 0 && (nums[i-1] == x || nums[i-1] == x-1)) {
                isLonely = false;
            }
            if(i < nums.length-1 && (nums[i+1] == x || nums[i+1] == x+1)) {
                isLonely = false;
            }
            if(isLonely) {
                lonelyList.add(x);
            }
        }  
        return lonelyList;
    }
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8};
        System.out.println(findLonely(nums));
    }
}