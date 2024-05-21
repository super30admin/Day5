/**
 Approach: Using a hash map and a set, map {key-> char, value-> char}

 working: checking if there is one to one mapping to all the characters
 if the map contains the character from S
 check if the value in the map is equal to current value of T, if not return false
 else adding the SCHAR as key and TCHAR as value in hash map,
 while adding checking if the set contains the TCHAR value,
 if yes, then the character is already mapped to a character of S in the map with
 retrun true

 Time Complexity: O(n)
 Space Complexity: O(1) //as the maximum range of a characters can go upto 26 chars which is much less than the limit provided as the length of the string

 */

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map.containsKey(sChar)) {

                if(map.get(sChar)!=tChar) {
                    return false;
                }
            }
            else {
                map.put(sChar, tChar);

                if(set.contains(tChar)) {
                    return false;
                }
                set.add(tChar);
            }

        }

        return true;

    }
}