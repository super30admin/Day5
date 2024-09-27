// Time Complexity :O(n)+O(m) where n is length of pattern and m is length of string
// Space Complexity :O(n) as I am making string and char arrays
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//logic is same as isomorphic array, we are using two hashmaps and if key is already there, we'll check
//if character is mapped to same string and vice versa if not, we'll return false
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
