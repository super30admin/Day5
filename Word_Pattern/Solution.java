// Time Complexity : O(n) -> where n is number of chars in pattern or number of words in string s.
// Space Complexity : O(n) -> due to array used for storing words of string s, and s can have n words.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * We want to make sure that each char in pattern has equal mapping with string is s.
 * So two conditions to deal with. 1. When char in pattern is new, corrosponding string in s also new
 * If char in pattern is seen before, then corrosponding string in s should be exact mappping
 * If anyone of above conditions fails, we return false. And if we come out of loop then we return true
 * To keep track of seen char of pattern and its corrposponding partner string in s, we use HashMap.
 * And to take care of new char, we use HashMap and HashSet so as to make sure, new char has new partner string.
*/


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMapCharacter, String map = new HashMap();
        HashSetString sSet = new HashSet();
        String[] strs = s.split( );
        
        if(pattern.length() != strs.length)return false;
        for(int i = 0; i  pattern.length(); i++){
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch) == false){
                if(sSet.contains(strs[i]))return false;
                map.put(ch, strs[i]);
                sSet.add(strs[i]);
            }
            
            else{
                if(map.get(ch).equals(strs[i]) == false)return false;
            }
        }
        
        return true;
    }
}