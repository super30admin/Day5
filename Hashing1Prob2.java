// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


// approach : Took one hashmap for storing character from s and t as key-value pairs. then took additional hashset for storing charcters from string t.
//            I'll insert values into hasmap and before it i'll whether key is already present. If present i'll check expected value. And also before inserting into hashset i'll cehck whether value is already present.
//            It shouldn't be present when i'm inserting a new pair

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t == null)
            return false;
        
        int sLen = s.length();
        int tLen = t.length();
        
        if(sLen != tLen)
            return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tMap = new HashSet<>();
        
        for(int i=0;i<sLen;i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar)
                    return false;
            }else{
                sMap.put(sChar,tChar);
                if(tMap.contains(tChar))
                    return false;
                tMap.add(tChar);
            }
            
        }
        
        return true;
        
    }
}