// Time Complexity: O(N) - length of pattern
// Space Complexity: O(M) - no .of unique words in String s 
// Did it run sucessfully on Leetcode? Yes
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length)
               return false;
        
        for (Integer i = 0; i < strs.length; i++ )
        {
            char c = pattern.charAt(i);
            String word = strs[i];
            
            if (!map.containsKey(c))
            {
                map.put(c, i);
            }
            if (!map.containsKey(word))
            {
                map.put(word, i);
            }
            if (map.get(c) != map.get(word))
                return false;
        }
        return true;
    }
}


