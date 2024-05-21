/*
    LC - 290. Word Pattern
    TC - O(n)
    SC - O(1)
    Approach -
        This is similar to Isomorphic. Approach is same.
        Possible solutions can be done using (two hashmap, one hashmap and hashset, using two array declaration, one hashmap).
        In this solution, I have used hashmap with hashset and check if exists in set before adding it and return accordingly.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strs[i];
            if(patternMap.containsKey(c)) {
                if(!patternMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                patternMap.put(c, str);
                if(set.contains(str)) {
                    return false;
                }
                set.add(str);
            }
        }
        return true;
    }
}