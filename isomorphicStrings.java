//This problem can be solved using 3 approaches:
//        approach 1: Using 2 HashMaps
//        TC: O(n)
//        SC: O(n)
//
//        approach 2: Using 2 Character arrays
//        TC: O(n)
//        SC: O(1)
//
//        approach 3: Using 1 HashMap and 1 HashSet
//        TC: O(n)
//        SC: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach 1: Using 2 HashMaps
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        // The first for loop if for string s, we will put each char from string s into the map as the key and the value will be the character at the same index on string t if charAt(i) of s does not exist, if it exists, we will check if the value in the map is equal to the charAt(i) of t, if not we return false
        for(int i=0; i<s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
            }
            else {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        // The second loop is for string t, similar logic as above
        for(int i=0; i<t.length(); i++) {
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), s.charAt(i));
            }
            else {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}


//Approach 2: Using 2 char Arrays
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = new char[100];
        char[] tArr = new char[100];

        // The first for loop if for string s, we will put each char from string s into the char array as the index-' ' and the value will be the character at the same index on string t if charAt(i) of s does not exist, if it exists, we will check if the value in the char array is equal to the charAt(i) of t, if not we return false
        //Note: We use ' ' since it contains ASCII value of 32 which is less than 97 for 'a' and 65 for 'A', hence the string can contain all alphabets and special characters
        for(int i=0; i<s.length(); i++) {
            if (sArr[s.charAt(i) - ' '] == 0) {
                sArr[s.charAt(i) - ' '] = t.charAt(i);
            }
            else {
                if (sArr[s.charAt(i) - ' '] != t.charAt(i)) {
                    return false;
                }
            }
        }

        // The second loop is for string t, similar logic as above
        for(int i=0; i<t.length(); i++) {
            if (tArr[t.charAt(i) - ' '] == 0) {
                tArr[t.charAt(i) - ' '] = s.charAt(i);
            }
            else {
                if (tArr[t.charAt(i) - ' '] != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}

//Approach 3: Using 1 HashMaps and 1 HashSet
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        // The loop if for string s, we will put each char from string s into the map as the key and the value will be the character at the same index on string t if charAt(i) of s does not exist, along with that we will also check if t.charAt(i) already exists in the HashSet if yes we return false since it was already mapped to something else,
        //if map contains s.charAt(i), we will check if the value in the map is equal to the charAt(i) of t, if not we return false
        for(int i=0; i<s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
                if (tSet.contains(t.charAt(i))) {
                    return false;
                }
                tSet.add(t.charAt(i));
            }
            else {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}