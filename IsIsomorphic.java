// Time Complexity : The time complexity is O(n) where n is the length of the string. Here the length of both the strings are equal.
// Space Complexity : The space complexity is O(1) since at the most the number of characters stored in the map is 26 irrespective of the length of the string.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        // Maps character in string s to character in string t
        Map<Character,Character> map1 = new HashMap<>();
        // Maps character in string t to character in string s
        Map<Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){

            Character ch = s.charAt(i);

            // If map1 doesn't contain the character key where as map2 contains the character key return false
            if(!map1.containsKey(ch)){
                if(map2.containsKey(t.charAt(i))){
                    return false;
                }
                // If both the maps doesn't have the character key, add them to both the maps
                map1.put(ch,t.charAt(i));
                map2.put(t.charAt(i),ch);
            }
            // If map1 contains the character key, but its value is not equal to the currently mapped character return false
            else{
                if(map1.get(ch) != t.charAt(i)){
                    return false;
                }
            }

        }

        return true;
    }
}