//Problem 1:
//
//        Given an array of strings, group anagrams together.
//
//        Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
//
//        Note: All inputs will be in lowercase. The order of your output does not matter.

// Time Complexity: O(n k log k)
// Space Complexity: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0 ; i < s.length() ; i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(map.containsKey(charS)){
                if(map.get(charS) != charT) return false;
            }

            else{
                if(map.containsValue(charT)) return false;
                map.put(charS,charT);
            }
        }

        return true;
    }
}