import java.util.*;
public class Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        tryCombinations(res, new StringBuilder(""), n, 0, 0);
        return res;
    }
    public static void tryCombinations(List<String> res, StringBuilder sb, int n, int start, int close) {
        if(sb.length() == (2 * n)) {
            res.add(sb.toString());
            return;
        }
        if(start < n) {
            sb.append("(");
            tryCombinations(res, sb, n, start+1, close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < start) {
            sb.append(")");
            tryCombinations(res, sb, n, start, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(generateParenthesis(n));
    }
}