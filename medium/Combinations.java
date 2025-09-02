import java.util.*;
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(1, n, k, new ArrayList<>(), res);
        return res;
    }
    public static void findCombinations(int start, int n, int k, List<Integer> curr, List<List<Integer>> res) {
        if(curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i <= n; i++) {
            curr.add(i);
            findCombinations(i+1, n, k, curr, res);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n, k));
    }
}