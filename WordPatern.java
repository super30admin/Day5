import java.util.HashMap;

public class WordPatern {
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : conditions for when to return false.


    // Your code here along with comments explaining your approach
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            //spring string s
            String[] strings = s.split(" ");

            //Check if the lengths are equal else return false
            if(pattern.length() != strings.length) return false;

            HashMap<Character, String> map = new HashMap<>();

            for(int i = 0; i < pattern.length(); i++){
                char pi = pattern.charAt(i);

                //return false if map doesn't contain key but value or add key and value to map
                if(!map.containsKey(pi)){
                    if(map.containsValue(strings[i])) return false;
                    map.put(pi, strings[i]);
                } else {
                    //return false if key exsits but doesn't match value
                    if(!map.get(pi).equals(strings[i])){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
