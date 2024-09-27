// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
         HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i))){
             if(!map1.get(pattern.charAt(i)).equals(words[i])){
               return false;
             }
            }else{
                 map1.put(pattern.charAt(i),words[i]);
            }
            
             if(map2.containsKey(words[i])){
             if(!map2.get(words[i]).equals(pattern.charAt(i))){
               return false;
             }
            }else{
                 map2.put(words[i],pattern.charAt(i));
            }
        }
         
            
        return true;
    }
}