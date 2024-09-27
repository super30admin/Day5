// Time Complexity : O(N) 
// Space Complexity : O(M) , M- number of unique words in string/pattern
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map12 = new HashMap<>();
        HashMap<String,Character> map21 = new HashMap<>();
        
        String[] words = s.split(" ");
        char[] letters = pattern.toCharArray();
        
        if(letters.length!= words.length)
            return false;
        
        for(int i=0;i<words.length;i++){
            if(!map12.containsKey(letters[i]) && !map21.containsKey(words[i])){
                map12.put(letters[i],words[i]);
                map21.put(words[i],letters[i]);
            }
            if(!map12.containsKey(letters[i]) || !map21.containsKey(words[i])){
               return false;
            }
            if(!map12.get(letters[i]).equals(words[i]) || map21.get(words[i]) != letters[i])
                return false;
        }
        return true;
    }
}