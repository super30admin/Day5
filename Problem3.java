// Time Complexity : O(n) where n is the number of words in the string
// Space Complexity : O(n) where n is total number of unique words
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Problem3 {
    public boolean isPatternMatching(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map = new HashMap<>();
        String strs[] = s.split(" ");
        if(strs.length != pattern.length()) {
            return false;
        }
        for(int i=0; i<pattern.length(); i++) {
            String str = strs[i].trim();
            char p = pattern.charAt(i);
            if(map1.containsKey(p)) {
                if(!map1.get(p).equals(str))
                    return false;
            } else {
                map1.put(p, str);
            }
            
            if(map.containsKey(str)) {
                if(map.get(str) != p)
                    return false;
            } else {
                map.put(str, p);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        String s = "abba";
        String t = "dog dog dog dog";
        System.out.println(obj.isPatternMatching(s, t));
    }
}

