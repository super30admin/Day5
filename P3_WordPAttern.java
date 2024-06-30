/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * Solved on leetcode? yes
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        for(int i=0 ; i<words.length ; i++) {
            if(patternMap.containsKey(pattern.charAt(i))) {
                if(!patternMap.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                } 
            } else {
                patternMap.put(pattern.charAt(i), words[i]);
            }

            if(wordMap.containsKey(words[i])) {
                if(!wordMap.get(words[i]).equals(pattern.charAt(i))) {
                    return false;
                } 
            } else {
                wordMap.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    } 
}  