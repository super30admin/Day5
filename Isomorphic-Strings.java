//time - O(n)
//space - (1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }

        return true;
    }
}