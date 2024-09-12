//Time Complexity = O(N)
//Space Complexity = O(1) because maximum we would have 26 and 26 extries in each hashMap

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if lengths are not same for source and target, then they can not be isomorphic
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap= new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar))
                sMap.put(sChar, tChar);
            if(sMap.get(sChar) != tChar) return false;
            if(!tMap.containsKey(tChar))
                tMap.put(tChar, sChar);
            if (tMap.get(tChar) != sChar) return false;
        }
        return true;
    }
}