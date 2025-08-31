import java.util.*;
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), res);
        return res;
    }
    public static void findSubsets(int nums[], int i, List<Integer> curr, List<List<Integer>> res) {
        if(i == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        findSubsets(nums, i+1, curr, res);

        curr.add(nums[i]);
        findSubsets(nums, i+1, curr, res);
        curr.remove(curr.size()-1);
    }
    public static void main(String[] args) {
        int nums[] = {1, 2};
        System.out.println(subsets(nums));
    }
}