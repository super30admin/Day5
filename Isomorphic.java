// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
    If the hash map doesn't have the character in s, we add the character in t to a set.
    We also add character in s as key and char in t as value.
    If the key is present, we check if it's value is equal to char in t.

*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> table = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        for(int i=0; i < s.length(); i++){
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            if(table.containsKey(ch1)){
                if(ch2 != table.get(ch1))
                    return false;
            }else{
                if(mapped.contains(ch2)) return false;
                mapped.add(ch2);
                table.put(ch1, ch2);
            }
        }
        return true;
    }
}