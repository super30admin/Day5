// Time Complexity: traversing both the strings once and determining if set contains the mapped element which is constant operation - O(n)
// Space Complexity: a new Map and new Set is used but there are only 26 characters which can be kept - O(26) => O(1)
// Did you complete it at leetcode: Yes
// Any problems faced with this question: Understood in class

// Explain your code here
class Solution {
    // Idea is to map each character in first string through the map to each character in 2nd string.
    // if the mapping is done we add the mapped charater of 2nd string in set
    // in case any other character comes with another mapping of character, string is not isomorphic
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++) {
            if(!sMap.containsKey(s.charAt(i))) {
                if(set.contains(t.charAt(i))) return false;
                sMap.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            } else {
                if(sMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}