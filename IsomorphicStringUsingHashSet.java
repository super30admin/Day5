//Time complexity: O(N)
//Space complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if the strings are not equal length, they will not be isomorphic
        if(s.length() != t.length()) {
            return false;
        }
        //hashmap to store mapping of String s and String t
        Map<Character, Character> sMap = new HashMap<>();
        //hashset to store mapped characters of String t
        Set<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            //if the map contains s and its value is not equal to t, return false
            if(sMap.containsKey(s1) && sMap.get(s1) != t1) {
                return false;
            }
            //if map does not the contains s, but the set contains the t
            //which means t has already been mapped to other character so return false
            if(!sMap.containsKey(s1) && tSet.contains(t1)) {
                return false;
            }
            sMap.put(s1,t1);
            tSet.add(t1);
        }
        return true;
    }
}