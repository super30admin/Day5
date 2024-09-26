/**
Problem: https://leetcode.com/problems/word-pattern/
Time complexity: O(n)
Space complexity: O(n)
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String words[] = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        for (int i = 0; i < words.length; ++i) {
            char c = pattern.charAt(i);
            
            if (map.containsKey(c)) {
                if (map.get(c).compareTo(words[i]) != 0) {
                    return false;
                }
            } else {
                if (set.contains(words[i])) {
                    return false;
                }
                map.put(c, words[i]);
                set.add(words[i]);
            }
        }
        return true;
    }
}