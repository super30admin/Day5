import java.util.HashMap;

public class IsomorphicStrings {
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


    // Your code here along with comments explaining your approach
    class Solution {

        public boolean isIsomorphic(String s, String t) {
            //checks to make sure length of both strings are the same and not null
            if(s.length() != t.length()) return false;
            if(s == null  || t == null) return false;

            HashMap<Character, Character> map = new HashMap<>();

            for(int i = 0; i<s.length(); i++){

                char si = s.charAt(i);
                char ti = t.charAt(i);

                //Check to see that the key doesnt exist and if value present return false else add key, value to map
                if(!map.containsKey(si)){
                    if(map.containsValue(ti)) return false;
                    map.put(si, ti);
                } else{
                    //return false if key and value doesn't match in map
                    if(map.get(si) != ti) return false;
                }
            }
            return true;
        }
    }
}
