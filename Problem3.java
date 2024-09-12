// Time Complexity : O(N) Where N is number of words in String s or number of characters in pattern string
// Space Complexity : O(M) Where M is number of words in String s, in our HashMap number of keys for charMap can only be O(26) i.e. total number of alphabets which is constant.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//using two HashMaps

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] word = s.split(" "); //Split string s into words.
        
        if (pattern.length() != word.length) return false;
        
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        
        for(int i=0;i<word.length;i++)
        {
            char c = pattern.charAt(i); 
            String w = word[i];

//If the character is NOT in the charMap, we additionally check whether that word is also in the wordMap.
//If that word is already in the wordMap, then you can return False immediately since it has been mapped with some other character before.

            if (!charMap.containsKey(c))    
            {
                if (wordMap.containsKey(w)) return false;
                else //else, update both mappings.
                {
                    charMap.put(c,w);
                    wordMap.put(w,c);
                }
            }
//If the character IS IN in the charMap, check whether the current word matches with the word which the character maps to in the charMap.
            else
            { 
                if (!charMap.get(c).equals(w)) return false;  
            }
        }
      return true;
    }
}
