// Time Complexity : O(mn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String>pmap = new HashMap<>();
        HashMap<String, Character>smap = new HashMap<>();
        char[] pc = pattern.toCharArray();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            if(pc.length!=words.length){//if length not equal return false
                return false;
            }
            //we check if the key is present in map but if its value 
            //doesnt match the second string return false
            //we check both maps like this
            if((pmap.containsKey(pc[i]) && (!pmap.get(pc[i]).equals(words[i]))) ||
              (smap.containsKey(words[i]) && smap.get(words[i])!=pc[i])){
                return false;
            }else{
                pmap.put(pc[i],words[i]);
                smap.put(words[i],pc[i]);
            }
        }
        return true;
    }
}
