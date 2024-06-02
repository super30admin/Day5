// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO

/* Approach: Similiar to isomorphic strings, we map character to string this time, and store the list of strings in a hash set to make
 * sure that we have not iterated over or already mapped its character to another string.
  */


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length ){
            return false;
        }
        HashMap<Character, String> charStr = new HashMap<>();// hash map to map char from s to string from strings
        HashSet<String> strings = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            String str = strs[i];
            if(charStr.containsKey(p)){  // check to see if s string's character has already been mapped
                if(!charStr.get(p).equals(str)){ // check to see if the mapping done is to the desired string
                    return false;
                }
            }else{
                charStr.put(p,str);
                if(strings.contains(str)){
                    return false;
                }
                strings.add(str);
            }
        }
        return true;
    }
}