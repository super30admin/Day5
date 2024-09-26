// Time Complexity : O(n)
// Space Complexity : O(1) because the given the problem Hashmap will store constant letters which are bounded.

// Approach:
//     Comapre the length of both the strings.
//     Create 2 Hashmaps and add corresponding character of each string as key & value.
//     Check if there is a match in Map otherwise return false

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> hm1 = new HashMap<>();
        Map<Character, Character> hm2 = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!hm1.containsKey(a)){
                hm1.put(a,b);
            } else{
                if(!hm1.get(a).equals(b)) return false;
            }
        }
        
        for(int i =0; i<t.length(); i++){
            char a = t.charAt(i);
            char b = s.charAt(i);
            if(!hm2.containsKey(a)){
                hm2.put(a,b);
            } else{
                if(!hm2.get(a).equals(b)) return false;
            }
        }
        return true;
    }
}