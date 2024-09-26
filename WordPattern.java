// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        
        if (pattern.length() != sArr.length) return false;
        
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = sArr[i];
            
            if (patternMap.containsKey(ch)) {
                if (!patternMap.get(ch).equals(str)) return false;
            } else {
                if (sSet.contains(str)) return false;
                patternMap.put(ch, str);
                sSet.add(str);
            }
            
        }
        
        return true;
    }
}