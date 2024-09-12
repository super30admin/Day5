//Time Complexity: O(n)
//Space Complexity : O(n)
//Approach -  hashmap and set
//Did your code run on leetcode : yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
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
                if(set.contains(sArray[i]))return false;
            }
            charMap.put(ch, sArray[i]);
            set.add(sArray[i]);
        }
        
        
        return true;
        
    }
}
