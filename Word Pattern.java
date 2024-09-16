// Time Complexity : O(n) n is length of given string
// Space Complexity : O(1) At max we can have 26 entries in both HashMap and HashSet.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Create a HashMap and HashSet and use HashMap to track mappings from word 
// pattern to s and HashSet to track words used up in s because there can be an 
// invalid mapping from pattern to s.

class Solution {
    HashMap<Character,String> m = new HashMap<Character,String>();
    HashSet<String> n = new HashSet<String>();
    String[] words;
    public boolean wordPattern(String pattern, String s) {
        int length = pattern.length();
        words = s.split(" ");
        if(length!=words.length){
            return false;
        }
        for(int i=0;i<length;i++){
            words[i] = words[i].strip();
            if(m.containsKey(pattern.charAt(i))){
                if(!words[i].equals(m.get(pattern.charAt(i)))){
                    return false;
                }
            }
            else{
                if(n.contains(words[i])){
                    return false;
                }
                m.put(pattern.charAt(i),words[i]);
                n.add(words[i]);
            }
        }
        return true;
    }
}