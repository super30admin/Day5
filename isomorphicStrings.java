import java.util.HashMap;
//Time Complexity : O(N) for all operations 
//Space Complexity : O(1) for all operations
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> dHash = new HashMap<>();
        for(int i=0; i< s.length();i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!sHash.containsKey(a)) // Check if character/Key a is already present in sHash Map or not
            {
                sHash.put(a,b); // If no, then put the key and value in the hashmap sHash
            }else
            {
                if(!sHash.get(a).equals(b)) return false; // If it is present than match the value against that key with the character b.
            }
            if(!dHash.containsKey(b)) // Check if character/Key b is already present in dHash Map or not
            {
                dHash.put(b,a); // If no, then put the key and value in the hashmap dHash
            }else
            {
                if(!dHash.get(b).equals(a)) return false; // If it is present than match the value against that key with the character a.
            }
        }
        return true;
    }
}