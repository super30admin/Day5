/**
Time complexity: O(n)
Space complexity: O(n)
Execute successfully on Leetcode: Yes
Any problems faced: No

The approach is similar to IsomorphicStrings.java solution
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<String,String> patternMap = new HashMap<>();
        HashMap<String,String> wordMap = new HashMap<>();
        
        if(pattern.length() != words.length) {
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++) {
            String str = Character.toString(pattern.charAt(i));
            
            if(patternMap.containsKey(str) && !patternMap.get(str).equals(words[i])) {
                return false;
            } else {
                patternMap.put(str, words[i]);
            }
                
            if(wordMap.containsKey(words[i]) && !wordMap.get(words[i]).equals(str)) {
                return false;
            } else {
                wordMap.put(words[i], str);
            }
        }
        return true;
    }
}
