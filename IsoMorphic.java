//Time Complexity: O(n).
//Space Complexity: O(2n).
//Does this code run on Leetcode: Yes.
//Any problems faced during execution: No. 

//Execution using a single hashmap and just adding one string to the map did not pass all the testcases. 
//The few corner cases where second string should be is isomorphic or not does not work. Therefore, using two hashmaps 
//for two strings is needed. The space can be further reduced by using one hashmap and adding both the strings. 




class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> isos = new HashMap<>();
        HashMap<Character, Character> isot = new HashMap<>();
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++){
            if(isos.containsKey(s.charAt(i))){
                if(isos.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else
                 isos.put(s.charAt(i), t.charAt(i));
            if(isot.containsKey(t.charAt(i))){
                if(isot.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
            else
                 isot.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}