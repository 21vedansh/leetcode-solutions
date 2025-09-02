import java.util.*;
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        tryCombinations(0, candidates, target, new ArrayList<>(), res);
        return res;
    }
    public static void tryCombinations(int start, int candidates[], int target, List<Integer> curr, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0) return;

        for(int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            tryCombinations(start, candidates, target - candidates[i], curr, res);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        int candidates[] = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}