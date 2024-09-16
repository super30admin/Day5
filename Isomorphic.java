// Time complexity 0(n) <- n length of the String
// Space complexity 0(n) <- For HashMap 0(2n) , hashset 0(n)


class Solution {
    public boolean isIsomorphic(String s, String t) {
        // base case
        if (s.length () != t.length()) return false;
        
     Map<Character, Character> charMap = new HashMap<Character, Character>();
       for(int i = 0; i < s.length(); i++){
  if(charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
  if(!charMap.containsKey(s.charAt(i)) && charMap.containsValue(t.charAt(i))){
                return false;
            }
 if(!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i))){
                charMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
        
           } 

