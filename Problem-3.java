import java.util.HashMap;

class Solution {
      
    
    // Time Complexity : O(n) space Complexity:O(n)
    // of pattern's length and String after converting it into array length mismatch return false;
    // then map each character ftom pattern to character array of s.
    // if map key's value contains first value from array then continue and if key is not present and value is present then return false; 
    
    public boolean wordPattern(final String pattern, final String s) {
        final HashMap<Character, String> hs = new HashMap<Character, String>();
        final String[] s1 = s.split(" ");

        if (s1.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            final char c = pattern.charAt(i);
            if(hs.containsKey(c)){
                    if(! hs.get(c).equals(s1[i]) )
                    {
                        return false;
                    }
            }
            else{
                if(hs.containsValue(s1[i])){
                    return false;
                }
                hs.put(pattern.charAt(i), s1[i] );
            }
        }
     
        
        return true;
    }
}