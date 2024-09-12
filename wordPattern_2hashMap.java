//Time Complexity: O(n)
//Space Complexity : O(n)
//Approach - 2 hashmap
//Did your code run on leetcode : yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        String[] sArray = s.split(" ");
        
        if(pattern.length() != sArray.length)return false;
        
        for(int i = 0; i < sArray.length; i++)
        {
            char ch = pattern.charAt(i);
            
            if(charMap.containsKey(ch))
            {
                String mapped = charMap.get(ch);
                if(!mapped.equals(sArray[i])) return false;
            }
            else
            {
                charMap.put(ch, sArray[i]);
            }
            
            if(sMap.containsKey(sArray[i]))
            {
                char mapped = sMap.get(sArray[i]);
                if(mapped != ch) return false;
            }
            else
            {
                sMap.put(sArray[i],ch );
            }
        }
        
        
        return true;
        
    }
}
