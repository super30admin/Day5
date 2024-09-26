// Time Complexity :O(n)...?
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

/*
* Your code here along with comments explaining your approach : 
* I have used 2 HashMap for mapping characters of string 1 and string 2.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
    
        // Edge case
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> h = new HashMap<>();
        
        // Logic
        for(int i=0;i<s.length();i++){
        // check if charAt s already mapped.
            if(h.get(s.charAt(i))!=null){
            // if values are not same, return false
                if(h.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            // put mapping of chars
            else h.put(s.charAt(i),t.charAt(i));
        }
        HashMap<Character,Character> h2 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(h2.get(t.charAt(i))!=null){
                if(h2.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else h2.put(t.charAt(i),s.charAt(i)); 
        }
    return true;
    }
}
