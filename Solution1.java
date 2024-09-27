// Time Complexity : o(n)
// Space Complexity :o(2n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> str1 = new HashMap<Character, Character>();
        Map<Character, Boolean> str2 = new HashMap<Character, Boolean>();
        
        for (int i =0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if (str1.containsKey(a))
            {
                if(str1.get(a) != b)
                {
                    return false;
                }
            }
            else
            {
                if(str2.containsKey(b))
                    return false;
                
                else
                {
                    str1.put(a, b);
                    str2.put(b, true);
                }
            }
        }
        return true;
        
    }
}