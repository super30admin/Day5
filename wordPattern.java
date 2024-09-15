// Time Complexity : O(N) hashing of string involved
// Space Complexity : O(N) used hashmap 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I could take care of test case having repeated characters only after using hashset.


// Your code here along with comments explaining your approach
//I used hashmap to map key value pairs. Hashset to keep track of repeated values stored in HashMap. (Previously)
//Solved using two hashmaps


class Solution {
    public boolean wordPattern(String pattern, String str) {
       if(pattern == null || str == null)
            return false;
        
        HashMap<Character, String> ps = new HashMap<>();
        HashMap<String, Character> sp = new HashMap<>();
        
        String[] word = str.split("\\s+");
        
        if(word.length != pattern.length())
            return false;
        
        for(int i=0; i<pattern.length(); i++){
            String w = word[i];
            char c = pattern.charAt(i);
            
            System.out.println(c);
            System.out.println(w);
            
            if(ps.containsKey(c)){
                if(!ps.get(c).equals(w)) return false;
            }else{
                ps.put(c,w);
            }
            
            if(sp.containsKey(w)){
                if(sp.get(w) != c) return false;
            }else{
                sp.put(w,c);
            }
        }
        
        return true;
    }
}