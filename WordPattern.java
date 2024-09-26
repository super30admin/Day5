// Time Complexity : O(N) n is size of string.
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String s) {
      HashMap<Character,String> h = new HashMap<Character,String>();
        String words[] = s.split(" ");          //Making an array of strings splitting them based on empty spaces 
        if(pattern.length() != words.length)    //checking if the pattern length and no of strings are equal
            return false;
        for(int i=0;i<pattern.length();i++){    
 //If the key already contains, then checking if the incoming value and the previous one are same. if not returning false
            if(h.containsKey(pattern.charAt(i))){ 
                if(!h.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            }
 //If there is no key but the value is already present then returning false            
            else if(h.containsValue(words[i]))
                return false;
            h.put(pattern.charAt(i),words[i]);
        }
        return true;
    }
}
