// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used hashmap to check 'pattern' to 's' mapping and hashset to check 's' to 'pattern' mapping

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String[] sArray = s.split(" ");
        int sLength = sArray.length;

        if (patternLength != sLength) return false;

        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();

        for (int i = 0; i < sLength; i++) {
            char patternChar = pattern.charAt(i);
            String sWord = sArray[i];

            if (patternMap.containsKey(patternChar)) {
                if (!(patternMap.get(patternChar)).equals(sWord)) return false;
            } else {
                if (!sSet.add(sWord)) {
                    return false;
                } else {
                    patternMap.put(patternChar, sWord);
                }
            }
        }
        return true;
    }
}
