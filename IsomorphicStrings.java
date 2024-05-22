// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only

// logic: Using HashMap and HashSet: Consider the characters in string s as key and characters in string t as value.
// If Character in s string is not present in the Hashmap put the key:value in the hash map and check if the value
// character associated to the string is present in the Hash set or not. If not present add it to the set.
// If the Character is present in the Hashmap and value is not equal to the character of t string return false.

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length() || s == null || t == null || s.length()==0 || t.length()==0){
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for(int i =0; i< s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar))
            {
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }

            else{
                sMap.put(sChar, tChar);
                if(tSet.contains(tChar)){
                    return false;
                }
                tSet.add(tChar);
            }
        }

        return true;
    }
}