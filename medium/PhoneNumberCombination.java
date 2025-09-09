import java.util.*;
public class PhoneNumberCombination {
    // 2D array with indices corresponding to letters on a keypad.
    static char buttons[][] = {{}, {}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};

    public static List<String> letterCombinations(String digits) {
        int length = digits.length(); 
        List<String> res = new ArrayList<>();
        if(length == 0) {
            return res; // return empty arraylist if digits length is zero.
        }
        tryCombinations(0, digits, length, res, new StringBuilder());
        return res;
    }
    public static void tryCombinations(int position, String digits, int length, List<String> res, StringBuilder sb) {
        if(position == length) {
            res.add(sb.toString());
            return;
        }

        // get possible letters from the current digit.
        char letters[] = buttons[Character.getNumericValue(digits.charAt(position))];
        // try each possible letter.
        for(int i = 0; i < letters.length; i++) {
            sb.append(letters[i]); // choose a letter.
            tryCombinations(position+1, digits, length, res, sb); // recurse for next position.
            sb.deleteCharAt(sb.length()-1); // [backtrack] remove the last added character. 
        }
    }
    public static void main(String[] args) {
        String digits = "89";
        System.out.println(letterCombinations(digits));
    }
}