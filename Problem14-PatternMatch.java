// Time Complexity : O(n)
// Space Complexity : O(nk) k-avg string length
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> smap = new HashMap();
        HashMap <String, Character> pmap = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!smap.containsKey(c)) {
                if (pmap.containsKey(w)) {
                    return false;
                } else {
                    smap.put(c, w);
                    pmap.put(w, c);
                }

            } else {
                String pmapped = smap.get(c);
                if (!pmapped.equals(w))
                    return false;
            }
        }

        return true;
    }
}
