// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// This problem can be solved by either using hashmap or character array. I have used character array here because I had attempted this question using hashmap earlier. 
// To ensure that both the strings are isomorphic, we need to check in both directions, hence usage of two hashmaps/character arrays. If 'a' corresponds to 's'; then 's' must also correspond to 'a'

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s== null || t == null) {
            return true;
        }
        if(s.length() != t.length()) {
            return false;
        }
        // using 2 character arrays instead of 2 hashmaps
        // considering 2 arrays in order to make sure that s is isomorphic to t and vice-versa.
        
        char[] str1 = new char[100]; // 100 allocations are done to account for all characters from 
        char[] str2 = new char[100]; // ' ' : ASCII val: 32 till 127th ascii value
        
        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(str1[ch1-' '] == 0) {
                str1[ch1-' '] = ch2;
            }
            else if(str1[ch1-' '] != ch2){
                return false;
            }
            
            if(str2[ch2-' '] == 0) {
                str2[ch2-' '] = ch1;
            }
            else if(str2[ch2-' '] != ch1){
                return false;
            }
        }
        return true;
    }
}
