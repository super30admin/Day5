//LC205 isomorphic strings

// I have used two hashmaps to save the mappings from s to t and t to s
// time complexity of this problem would be O(1) as the algorithm needs to enter values in the map for all the
// letters in the string s and checking the mapping with elements in t would be constant time


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character, Character> mapping1 = new HashMap<>();
        HashMap<Character, Character> mapping2 = new HashMap<>();
        
        for (int i =0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(mapping1.containsKey(sChar)){
                if(mapping1.get(sChar)!= tChar) return false;
            }
                  else
                  {
                    mapping1.put(sChar, tChar);
                  }    
            
            if(mapping2.containsKey(tChar)){
                if(mapping2.get(tChar)!= sChar) return false;
            }
                  else
                  {
                    mapping2.put(tChar, sChar);
                  }    

        }
        return true;
        
    }
}