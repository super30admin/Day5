// Time Complexity : O(n) where n is size of strings
// Space Complexity :O(2n) where n is size of strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        int i=0;
        
        
        //characters in s are keys
        //characters in t are values
        while(i<s.length())
        {
            if(!map.containsKey(s.charAt(i)))           //insert if map doesnt contain key
            {
                if(map.containsValue(t.charAt(i)))      //if t's character is in map as a value for some other key, return false
                    return false;
                map.put(s.charAt(i),t.charAt(i));       //insert if i th char of s is a new key and i th char of t is a new value
            }
            else
            {
                if(map.get(s.charAt(i))!=t.charAt(i))   //Return false if the key exists but the value is something other that i th                                                         //value of t
                    return false;
            }
            i++;
        }
        return true;
    }
}