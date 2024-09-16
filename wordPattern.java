Time Complexity: O(NlogN)
Space Complexity:O(N)
Code run on leetcode: Yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s.length() == 0) {
            return false;
        }
        
        String[] strs = s.split(" ");
        if(strs.length != pattern.length()) {
            return false;
        }
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            String str = strs[i];
            char ch = pattern.charAt(i);
            
            if(strMap.containsKey(str) && strMap.get(str) != ch) {
                return false;
            }
            
            if(patternMap.containsKey(ch) && !patternMap.get(ch).equals(str)) {
                return false;
            }
            
            patternMap.put(ch, str);
            strMap.put(str, ch);
        }
        return true;
    }
}
        
    
