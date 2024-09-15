// Time Complexity : O(1) constant characters are getting inserted in hashmap. Hashing of character O(1).
// Space Complexity : O(N) as I have used both hashmap 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Same as pattern matching
//UPdate: Solved using two hashmaps.


// Your code here along with comments explaining your approach: Same as pattern matching

class Solution {
       public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i)) != t.charAt(i)) return false;
                }else{
                    if(!set.contains(t.charAt(i))){
                      map.put(s.charAt(i), t.charAt(i));  
                       set.add(t.charAt(i)); 
                    }else{
                        return false;
                    }
                    
                }
        }
        
        return true;
    }
}