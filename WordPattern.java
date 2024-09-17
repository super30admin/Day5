// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, difficult to understand that two maps are required.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() == 1) return true;
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        HashMap<Character, String> cmap = new HashMap<>();
        HashMap<String, Character> wmap = new HashMap<>();
        for(int i = 0; i<words.length;i++){
            char p = pattern.charAt(i);
            String w = words[i];
            if(!cmap.containsKey(p)){
                if (wmap.containsKey(w)) {
                    return false;
                }
                else{ 
                    cmap.put(p, w);
                    wmap.put(w,p);
                }
            }else{
                String word = cmap.get(p);
                if(!word.equals(w)){
                    return false;
                }
            }
        }
        return true;
    }
}