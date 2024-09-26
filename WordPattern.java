/**
 Time complexity= O(n) where n is the lebgth of pattern
 Space complexity= o(n) where n is length of pattern
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0) return false;

        Map<Character, String> patternToS = new HashMap<>();
        Set<String> stringOccurance = new HashSet<>();

        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length) return false;

        for(int i = 0; i < sArray.length; i++) {
            char c = pattern.charAt(i);

            if (patternToS.containsKey(c)) {
                if (!patternToS.get(c).equals(sArray[i])) {
                    return false;
                }
            } else if (stringOccurance.contains(sArray[i])) {
                return false;
            }

            patternToS.put(c, sArray[i]);
            stringOccurance.add(sArray[i]);
        }

        return true;
    }
}