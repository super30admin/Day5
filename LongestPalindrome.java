import java.util.HashSet;

// Time Complexity :O(N)
// Space Complexity :O(1) max alaphabets can be 26 so space compelxity is constant.
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO


public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> sSet = new HashSet<>();

        if (s.length() == 0 || s == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sSet.contains(s.charAt(i))) {
                count = count + 2;
                sSet.remove(s.charAt(i));
            } else {
                sSet.add(s.charAt(i));
            }
        }
        if (!sSet.isEmpty()) {
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        LongestPalindrome obj=new LongestPalindrome();
        System.out.println(obj.longestPalindrome("aaabbbbacsdad"));
    }
}
