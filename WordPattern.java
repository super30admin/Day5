// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only

// logic: Using 2 HashMap: Consider the characters in string pattern as key and words in string s as value for the 1st Hashmap.
// Similarli Consider the words in string s as key and characters in string pattern as value for the 2st Hashmap.
// If Character in pattern string is not present in the Hashmap put the key:value in the 1st hash map and check if the value
// character associated to the string is present in the  2nd Hashmap or not. If not present add it to the 2nd hashmap.
// If the Character is present in the Hashmap and value is not equal to the word of s string return false.

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split(" ");
        if(pattern == null || strs == null || pattern.length() == 0 || strs.length == 0 || pattern.length() != strs.length){
            return false;
        }

        HashMap<Character, String> Map1 = new HashMap<>();
        HashMap<String, Character> Map2 = new HashMap<>();

        for(int i =0 ; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strs[i];

            if((Map1.containsKey(pChar) && !Map1.get(pChar).equals(str)) || (Map2.containsKey(str) && !Map2.get(str).equals(pChar))){
                return false;
            }
            else{
                Map1.put(pChar, str);
                Map2.put(str, pChar);
            }
        }
        return true;
    }
}