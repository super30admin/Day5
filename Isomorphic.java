//Time Complexity: O(N) 
// Space Complexity:O(1) as we have only 26 character in english alphabets
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tMap = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }else{
                if(tMap.contains(tChar)) return false;
                sMap.put(sChar, tChar);
                tMap.add(tChar);
            }
        }
        return true;
    }
}
/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }else{
                sMap.put(sChar,tChar);
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }else{
                tMap.put(tChar,sChar);
            }
        }
        return true;
    }
}
*/