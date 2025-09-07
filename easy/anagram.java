import java.util.*;
public class anagram {
    public static boolean isAnagram(String s, String t) {
        // check the lengths, if not equal stings cannot be anagrams.
        if(s.length() != t.length()) {
            return false;
        }

        // convert both strings into char arrays.
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        
        // sort the individual arrays.
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray); // compare the sorted arrays and return. (true)
    }
    public static void main(String args[]) {
        String s = "earth";
        String t = "heart";
        System.out.println(isAnagram(s, t));
    }
}