/*
Author: Akhilesh Borgaonkar
Problem: Given two strings s and t, determine if they are isomorphic.
Approach: Using hashing technique here to find if the current character in string s is already mapped to a charater in string t.
    Using two hashmaps here to having both way mapping of characters from s & t strings.
Time Complexity: O(n) where n is length of input string.
Space complexity: O(1) constant as in worst we will have 26 entries for each alphabet in hashmaps.
LC Verified.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map1 = new HashMap<>();   //map for storing original mapping
        HashMap<Character, Character> map2 = new HashMap<>();   //map for storing mirrored mapping
        
        if(s.length() != t.length())                    //edge case if input strings are of unequal length then they are not isomorphic
            return false;
        
        for(int i=0; i<s.length(); i++){                //parse strings
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);
            
            if(map1.containsKey(sCurr)){                //check if the current char is present in original map
                if(!map1.get(sCurr).equals(tCurr))      //if present then check the value mapped is equal to same index in string t
                    return false;
            } else
                    map1.put(sCurr, tCurr);             //if not present in hashmap then add new mapping
            
            if(map2.containsKey(tCurr)){                //similarly check the reverse mapping
                if(!map2.get(tCurr).equals(sCurr))
                    return false;
            } else
                    map2.put(tCurr, sCurr);
            
        }
        return true;                //if no mismatched mapping found then the string is isomorphic
    }
}