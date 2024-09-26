/*
// time complexity: O(n)
// space ccomplexity; O(n) , for map and set
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

algorithm:
- use hashmap and hashset
- first check if both string are of equal length, if not then return false
- for each char in s and t, map char c1 from string s to char c2 in string t and save (c1,c2) pair in hashmap
- then also, store c2 char in set so that no other character matches with same character, if yes return false;

*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //first check in isomorphic strings is to check if 2 string are equal length
        if(s.length() != t.length()){
            return false;
        }
        
        //we can use hashset to solve this problem
        //number of unique characters in both strings should be equal
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0;i <s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(!map.containsKey(c1))
            {
                if(set.contains(c2)){
                    return false;
                }else{
                    map.put(c1,c2);
                    set.add(c2);
                }
            }
            else{
                char value = map.get(c1);
                if(!set.contains(value)){
                    return false;
                }
                if(value != c2){
                    return false;
                }
              }
        }
        return true;
    }
        
}

