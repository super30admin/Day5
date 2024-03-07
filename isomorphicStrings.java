//time: O(N * L) where N is the no of strings and L is the max length of a string
//space: O(2N*L)
//approach: create two maps to map the relationship of characters from first string to second and other way around. Then return false if the constraints are broken.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i =0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(!sMap.containsKey(charS)) {
                // if(map.containsKey(charT)) return false;
                sMap.put(charS, charT);
            } else {
                if(sMap.get(charS) != charT) return false;
            }
            
            if(!tMap.containsKey(charT)) {
                // if(map.containsKey(charT)) return false;
                tMap.put(charT, charS);
            } else {
                if(tMap.get(charT) != charS) return false;
            }
        }
        return true;
    }
}
