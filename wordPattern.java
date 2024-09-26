// Time Complexity : O(n)
// Space Complexity : O(2n) HashMap Space; Order of n since two hashMaps
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> ChToS = new HashMap<>();
        HashMap<String, Character> StoCh = new HashMap<>();
        String[] strs = s.split(" ");
	
	//check if length of pattern and length of strs array is same 
        if(pattern.length() != strs.length)
            return false;
        for(int i = 0;i < pattern.length();i++){
            char chP = pattern.charAt(i);
            String word = strs[i];
            //char to word mapping
            if(ChToS.containsKey(chP) && !(ChToS.get(chP).equals(word)))
                return false;
            else
                ChToS.put(chP, word);
            
            //word to char mapping
            
            if(StoCh.containsKey(word) && !(StoCh.get(word).equals(chP)))
                return false;
            else
                StoCh.put(word, chP);
        }
               
        return true;
    }
}