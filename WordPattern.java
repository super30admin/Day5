// Time Complexity : O(n), length of pattern 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// maintain mapping from pattern to word, if incase pattern doesnt exist but word already exists return false else verify if word[i] is same for the pattern[i]

class Solution {
    public boolean wordPattern(String pattern, String str) {
         String[] words = str.split(" ");
        
         if(pattern.length() != words.length) return false;
        
        HashMap<Character, String> map = new HashMap<>();
         HashSet<String> set = new HashSet<>();
        
         for(int i=0; i<pattern.length(); i++){
             char ch = pattern.charAt(i);
             
             if(!map.containsKey(ch)){
                 if(set.contains(words[i])) 
                     return false;
                     
                 map.put(ch, words[i]);
                 set.add(words[i]);
             } 
             else{
                 if(!map.get(ch).equals(words[i])) 
                     return false;
             }
          }
        
          return true;
     }
}