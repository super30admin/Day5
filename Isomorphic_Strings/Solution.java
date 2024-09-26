//Time complexity : O(n) where n is number of chars in s or t
//Space complexity: O(1) since only unique mappings and chars will go in HashMap and HashSet. And no of unique chars are constant
//Did this run successfully on LeetCode : yes
//Any difficulties faced during coding this: No

//Approach with code

/**
 * We want to make sure that each char in s has equal mapping for char in t.
 * So two conditions to deal with. 1. When char in s in new, corrosponding char in t is also new
 * If char in s is seen before, then corrosponding char in t should be exact mappping
 * If anyone of above conditions fails, we return false. And if we come out of loop then we return true
 * To keep track of seen char in s and its corrposponding partner char in t, we use HashMap.
 * And to take care of new char in s, we use HashMap and HashSet so as to make sure, new char in s has new partner char in t.
*/



class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        
        for(int i = 0; i < s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar) == false){
                if(tSet.contains(tChar))return false;
                else{
                    sMap.put(sChar, tChar);
                    tSet.add(tChar);
                }
            }else{
                if(sMap.get(sChar) != tChar)return false;
            }
        }
        
        return true;
    }
}