//Time Complexity :O(logm)+O(n) 
// Space Complexity : o(n)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        char[] patternArr = pattern.toCharArray();
        String[] sArr = s.split(" ");
        if (patternArr.length != sArr.length) {
            return false;
        }
        for (int i = 0; i < patternArr.length; i++) {

            if (map1.containsKey(patternArr[i]) && (!map1.get(patternArr[i]).equals(sArr[i]))
                    || (map2.containsKey(sArr[i]) && map2.get(sArr[i]) != patternArr[i])) {

                return false;
            }

            else {

                map1.put(patternArr[i], sArr[i]);
                map2.put(sArr[i], patternArr[i]);
            }
        }
        return true;
    }
}