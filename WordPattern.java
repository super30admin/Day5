
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String word[] = s.split(" ");
        if (word.length != pattern.length())
            return false;
        for (Integer i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = word[i];
            if (!map.containsKey(c))
                map.put(c, i);
            if (!map.containsKey(w))
                map.put(w, i);
            if (map.get(c) != map.get(w))
                return false;
        }
        return true;
    }
}
