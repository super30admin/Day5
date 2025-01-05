// We will have a HAshMAp and a hashset. Hashmap will store the character from 1st string as key and character from 2nd string
// as value. And in the Hashset, we will go on adding the character from 2nd string after adding it in the hashmap. 
// if the character in HAshmap is mapped to a value and that value is not there in hashset, return false. 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if((s.length() != t.length()) || (s == null || s.length() == 0)) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length() ; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else
            {
                sMap.put(sChar, tChar);
                if(set.contains(tChar)) {
                    return false;
                }
                set.add(tChar);
            }
        }
        return true;
    }
}