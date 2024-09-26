//Time complexity: O(n);
//Space complexity: O(1) -> at any time there will only be ASCII chars
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//2 hashmap solution
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t == null){
            return false;
        }
        
        Map<Character, Character> sTotMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        

        //iterate through every char in String s
        for(int i=0;i<s.length(); i++) {

            //get chars at index i
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //check if key sChar exists in map
            if(sTotMap.containsKey(sChar)) {    
                //get the mapped char and compare with tChar
                char mapped = sTotMap.get(sChar);
                //if no match return false
                if(mapped != tChar) {
                    return false;
                }
            } else {//key does not exist
                //check if we have already checked for tChar
                if(tSet.contains(tChar)) {
                    //if yes, that means a different mapping exists for tChar
                    return false;
                }

                //else add tChar value with sChar key
                //and add tChar to tSet 
                sTotMap.put(sChar,tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}