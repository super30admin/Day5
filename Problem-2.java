//Time Complexity: O(N)
//Space Complexity: O(1)
// For this solution we make use of two hashmaps and check whether a value in the first map is mapped to a value in the second hashmap
//If there is a corresponding value present, we check if the new values that we are adding are the same as the value previously added.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap <Character,Character> sMap = new HashMap<>();
        HashMap <Character,Character> tMap = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }else{
                if(sMap.get(sChar)!= tChar) return false;
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }else{
                if(tMap.get(tChar)!= sChar) return false;
            }
        }
        
        return true;
    }
}