// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, I didn't understand the question at first


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            //To verify the unique mapping
            //Check if doesn't exist
            if(!map.containsKey(ch1)){
                //Check if the value is already mapped to another key
                if(map.containsValue(ch2)){
                    return false;
                }
                else{
                    //Add the mapping
                    map.put(ch1,ch2);                   
                }
            }
            //Check if the mapping is unique
            else if(map.get(ch1)!=ch2){
                return false;
            }            
        }
        return true;
    }
}