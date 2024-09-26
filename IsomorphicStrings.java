//Time complexity: O(N), where n is the length of the string
//Space complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if the strings are not equal length, they will not be isomorphic
        if(s.length() != t.length()) {
            return false;
        }
        //map for storing s->t mapping
        Map<Character, Character> sMap = new HashMap<>();
        //map for storing t->s mapping
        Map<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            //if smap contains s, get the value of s and check with the current t value
            //if they dont match return false
            if(sMap.containsKey(s1) && sMap.get(s1) != t1) {
                return false;
            }
            //else put the mapping in the map
            else {
                sMap.put(s1, t1);
            }
            //if tmap contains t, get the value of t and check with the current s value
            //if they dont match return false
            if(tMap.containsKey(t1) && tMap.get(t1) != s1) {
                return false;
            }
            else {
                tMap.put(t1, s1);
            }
            
        }
        return true;
    }
}