// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> uniqueWords = new HashSet<>();

        String[] words = s.split("\\s+");

        if(pattern.length() != words.length) return false;

        for(int i = 0 ; i < pattern.length(); i++) {
            //check if the map contains the key. Match it. if it does not match return false
            Character patternChar = pattern.charAt(i);
            if(patternMap.containsKey(patternChar)){
                if(!words[i].equalsIgnoreCase(patternMap.get(patternChar))){
                    return false;
                }
            } else {
                if(uniqueWords.contains(words[i])) return false;
                else {
                    patternMap.put(patternChar, words[i]);
                    uniqueWords.add(words[i]);
                }
            }

        }
        return true;

    }
}
