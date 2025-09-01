import java.util.*;
public class Subsetsll {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        findSubsets(nums, 0, new ArrayList<>(), res);
        return res;
    }
    public static void findSubsets(int nums[], int start, List<Integer> curr, List<List<Integer>> res) {

        res.add(new ArrayList<>(curr));

        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;

            curr.add(nums[i]);
            findSubsets(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }
}