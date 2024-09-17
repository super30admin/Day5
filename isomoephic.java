//o(n*m) tome complexity
//o(1) space complexity
// passed all leetcode test cases
//used approach of creating two hashmaps discussed in class


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] shash = new char[256];
        char [] thash = new char[256];
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sHash.containsKey(sChar)){
                sHash.put(sChar, tChar);
            } else {
                if(sHash.get(sChar) != tChar) return false;
            }
            if(!tHash.containsKey(tChar)){
                tHash.put(tChar, sChar);
            } else {
                if(tHash.get(tChar) != sChar) return false;
            }
        }
        return true;
    }
}