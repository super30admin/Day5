/**
Time complexity: O(n)
Space complexity: O(n)
Execute successfully on Leetcode: Yes
Any problems faced: No
*/
class IsomorphicStrings {
    /**
    Approach:
    - Check the lengths of both strings. If they're unequal, return false directly.
    - Use 2 hahmaps:
      * One to store mappings of string s -> string t
      * Another to store mappings of string t -> string s
    */

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sTotMap = new HashMap<>();
        HashMap<Character,Character> tTosMap = new HashMap<>();
        
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i=0; i<s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            
            //s to t
            if(sTotMap.containsKey(chs) && (sTotMap.get(chs)) != cht) {
                return false;
            } else {
                sTotMap.put(chs,cht);
            }
            
            //t to s
            if(tTosMap.containsKey(cht) && (tTosMap.get(cht)) != chs) {
                return false;
            } else {
                tTosMap.put(cht,chs);
            }
        }
        return true;
    }
}
