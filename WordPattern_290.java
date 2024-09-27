// Time Complexity : O(n)  n= length of pattern
// Space Complexity : O(n * m )  n = num of character is pattern and m = number of words into string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String st) {
        
        Map<Character,String> p = new HashMap<>();
        Map<String, Character> s = new HashMap<>();
        
        String[] words=st.split(" ");
        
        if(pattern.length()!=words.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++) {
            char ss=pattern.charAt(i);
            String tt= words[i];
            
            if(p.containsKey(ss) && !p.get(ss).equals(tt)){
                return false;
            } else {
                p.put(ss,tt);
            }
            
             if(s.containsKey(tt) && s.get(tt)!=ss){
                return false;
            } else {
                 s.put(tt,ss);
             } 
        }
        
        return true;
    }
}