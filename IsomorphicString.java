
// Time Complexity : O(n)  where n is number of characters in s/t
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //create hashmap to store and map the character s to t
        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hm.containsKey(c1)) {
                char x = hm.get(c1);
                if (x != c2)
                    return false;
            //hashet will ensure that the character which is associated with some key doesn't get associated with something else.
            }else if(hs.contains(c2)){
                return false;
            }
            else{
                hs.add(c2);
                hm.put(c1, c2);
            }
        }
        return true;
    }
}