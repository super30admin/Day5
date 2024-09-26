/**
Problem: https://leetcode.com/problems/isomorphic-strings/
Time complexity: O(n)
Space complexity: O(1) because the hashset and hashmap would only contain 26 entries at max - one for each character
*/
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        
        for (int i = 0; i < s.length(); ++i) {
            if (sToTMap.containsKey(s.charAt(i)) && sToTMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            
            if (!sToTMap.containsKey(s.charAt(i)) && tSet.contains(t.charAt(i))) {
                return false;
            }
            sToTMap.put(s.charAt(i), t.charAt(i));
            tSet.add(t.charAt(i));
        }
        return true;
    }
}