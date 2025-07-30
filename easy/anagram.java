import java.util.*;
public class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
    public static void main(String args[]) {
        String s = "earth";
        String t = "heart";
        System.out.println(isAnagram(s, t));
    }
}