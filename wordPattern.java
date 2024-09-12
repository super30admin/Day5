// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Since we are comparing 2 strings we should use .equals method and not ==


// Your code here along with comments explaining your approach
// Approach: Use 1 HashMap to store the character in pattern and string in s, and 1 HashSet to store the words in string s,
// return false if word already exists in set for a new alphabet in pattern.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null || pattern.length() == 0 || s.length() == 0) return false;

        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();
        String[] sArr = s.split(" ");

        if (sArr.length != pattern.length()) {
            return false;
        }

        for (int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String currS = sArr[i];

            if (!patternMap.containsKey(c)) {
                patternMap.put(c, currS);
                if (sSet.contains(currS))
                    return false;
                sSet.add(currS);
            }
            else {
                if(!patternMap.get(c).equals(currS)){
                    return false;
                }
            }
        }
        return true;
    }
}