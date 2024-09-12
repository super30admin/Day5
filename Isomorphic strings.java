
/*
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_dict = {}
        t_dict = {}
        
        for i in range(len(s)):
            if s[i] in s_dict:
                if s_dict[s[i]] != t[i]:
                    return False
            
            else:
                s_dict[s[i]] = t[i]
                
            if t[i] in t_dict:
                if t_dict[t[i]] != s[i]:
                    return False
            else:
                t_dict[t[i]] = s[i]
        
        return True
*/

// Time Complexity : O(n) where n is size of any string
// Space Complexity : O(1) as alphabets are only 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: I have used two hashmap to store mapping to characters

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        HashMap<Character, Character> s_map = new HashMap<Character, Character>();
        HashMap<Character, Character> t_map = new HashMap<Character, Character>();
        
        for (int i=0; i<s.length(); i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            
            if (s_map.containsKey(s_char)){
                if (s_map.get(s_char) != t_char)
                    return false;
            }else{
                s_map.put(s_char, t_char);
            }
            
            if (t_map.containsKey(t_char)){
                if (t_map.get(t_char) != s_char)
                    return false;
            }else{
                t_map.put(t_char, s_char);
            }
        }
        
        return true;
    }
}