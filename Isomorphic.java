// Time Complexity : O(n) where n is the length of intput string
// Space Complexity : O(n) where n is number of entries in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Looking for other approaches in class

//Beacuse every character is supposed to be mapped to unique character to become isomorphic
//We can consider respective char from s and t to be unique key value pair
//if length of strings is not equal, return
//if char from s is not present in map but the corresponding value is already present in map, then it cannot be isomorphic, so we return false
//if char from s is present, we check if its value is equal to the correspnding char at that index in t, if it isnt same, return false
//in other cases , it will be true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> res=new HashMap<>();
        if (s.length()==null||t.length()!=s.length()||t.length()==null)
         return false;
        
        for(int i=0;i<s.length();i++){
            if(!res.containsKey(s.charAt(i))) {
                if(res.containsValue(t.charAt(i))) { return false; }
            res.put(s.charAt(i),t.charAt(i));
            }
            
            else if(res.get(s.charAt(i))!=t.charAt(i)) return false;
        }
        return true;
    }
}