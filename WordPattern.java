/*
 *  Time Complexity: O(N) where N is the length of the pattern
 *  Space Complexity: O(1) Since the number of pattern is constant limited to english letters
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *
 *  Create two hashmaps and store the mapping for all the characters from pattern to words in string and vice-versa. Return false if there is any new mapping that is different from the previous mapping.
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> revmap = new HashMap<>();
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            Character ch = pattern.charAt(i);
            if(map.containsKey(word) && map.get(word)!=ch){
                return false;
            }else{
                map.put(word, ch);
            }
            if(revmap.containsKey(ch) && !revmap.get(ch).equals(word)){
                return false;
            }else{
                revmap.put(ch, word);
            }
            
        }
        return true;
    }
}
