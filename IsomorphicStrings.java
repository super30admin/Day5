/*
    Leetcode problem 205: Isomorphic Strings
    T.C: O(n) - given String s and t need to be traversed i order to check if they are isomorphic or not
    S.C: O(1) - no matter how long the String is, we have only 26 characters stored in the HashMap and HashSet based solution

    Solved using a HashMap and Hashset, create a mapping of each char in s to t and then add the mapped char t in a hashset
    Now when we receive the same pair again skip and move to the next, when we receive an unmatched pair (w.r.t previous mapping)
    return false.
 */

 class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() != t.length()) return false;

        HashMap<Character, Character> checkIso = new HashMap<>();
        HashSet<Character> charMapped = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!checkIso.containsKey(sChar)){

                if (!charMapped.contains(tChar)) {
                    charMapped.add(tChar);
                    checkIso.put(sChar, tChar);
                } else {
                    return false;
                }

            } else {
                // Challenge lies in this condition - if the char is already mapped then we need to check if the mapping element is the same
                //As we are using Hashset based solution we need to check if current mapping element is in the hashset
                //And if so the char is Mapped then it should be the same as previous mapping (i.e from HashMap)
                if (!charMapped.contains(tChar) || tChar != checkIso.get(sChar)) { 
                    return false;
                }

            }
        }

        return true;
    }
}

//Approach 2 - Intesting solution of same T.C and S.C

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        //store sChar to tChar mapping
        char[] sArray = new char[96]; // 128 Total ASCII values - 32 (CTRL operations) - 96 ASCII Symbols 
        //store tChar to sChar mapping
        char[] tArray = new char[96]; // 32nd ASCII value is space ' '

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sArray[sChar - ' '] == '\u0000') { // null char representation in the empty char array
                sArray[sChar - ' '] = tChar;
            } else {
                if (sArray[sChar - ' '] != tChar) {
                    return false;
                }
            }

            if (tArray[tChar - ' '] == '\u0000') {
                tArray[tChar - ' '] = sChar;
            } else {
                if (tArray[tChar - ' '] != sChar) {
                    return false;
                }
            }
        }

        return true;
    }
}