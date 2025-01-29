//This solution to Isomorphic strings problem uses HashMap for storing 1-1 mapping of characters from string s to string t 
//and hashset is used for storing the characters from string t that have a mapping with characters from String s
//if a mapping for a character is already present in the map then it will check for the value and if the incoming value is different from the existing value then it is not a isomorphic string
// and if mapping doesn't exist then it will check if the value is present in the valueset or not. If the value is present in valueset then not isomorphic strings
// else adds mapping to map and adds value to the valueset and finally returns true if the 2 strings are isomorphic strings

import java.util.HashMap;
import java.util.HashSet;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> mapStoT = new HashMap<>();
        HashSet<Character> valueSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapStoT.containsKey(s.charAt(i))) {
                if (mapStoT.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {

                if (valueSet.contains(t.charAt(i)))
                    return false;

                mapStoT.put(s.charAt(i), t.charAt(i));
                valueSet.add(t.charAt(i));

            }
        }
        return true;
    }

    /*
     * public static void main(String args[]) {
     * Solution isomorphicSolution = new Solution();
     * System.out.println(isomorphicSolution.isIsomorphic("egg", "add"));
     * System.out.println(isomorphicSolution.isIsomorphic("bbbaaaba", "aaabbbba"));
     * System.out.println(isomorphicSolution.isIsomorphic("paper", "title"));
     * System.out.println(isomorphicSolution.isIsomorphic("badc", "baba"));
     * }
     */

}