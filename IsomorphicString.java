// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach 1 : USing 2 hashmaps - one hashmap to store the mapping of first string to second, other hashmap to store the mapping of second string to first
// Approach 2: USing 1 hashmap and hashset -> hashmap is for tracking the mapping of first string to second and hashset is for storing the keys of all second string
//Approach 3: using char array
// For above all 3 approaches, time and space complexity is same.
class IsomorphicString {
    //Approach 1
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();

        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }

        for(int i=0;i< s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(smap.containsKey(sChar)) {
                if(smap.get(sChar) != tChar) {
                    return false;
                }
            }else{
                smap.put(sChar, tChar);
            }

            if(tmap.containsKey(tChar)) {
                if(tmap.get(tChar) != sChar) {
                    return false;
                }
            }else{
                tmap.put(tChar, sChar);
            }
        }
        return true;

        //Approach 2:
       /* public boolean isIsomorphic(String s, String t){
            HashMap<Character, Character> smap = new HashMap<>();
            HashSet<Character> set = new HashSet<>();

            if (s == null && t == null) {
                return true;
            }
            if (s == null || t == null) {
                return false;
            }
            if (s.length() != t.length()) {
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if (smap.containsKey(sChar)) {
                    if (smap.get(sChar) != tChar) {
                        return false;
                    }
                } else {
                    if (set.contains(tChar)) return false;
                    smap.put(sChar, tChar);
                    set.add(tChar);
                }
            }
            return true;
        }*/

        //Approach 3:
        /**public boolean isIsomorphic(String s, String t){

            if (s == null && t == null) {
                return true;
            }
            if (s == null || t == null) {
                return false;
            }
            if (s.length() != t.length()) {
                return false;
            }

            char[] smap = new char[256];
            char[] tmap = new char[256];

            for (int i = 0; i < 256; i++) {
                smap[i] = 1;
                tmap[i] = 1;
            }

            for (int i = 0; i < s.length(); i++) {
                char schar = s.charAt(i);
                char tchar = t.charAt(i);
                if (smap[schar] != 1) {
                    if (smap[schar] != tchar) {
                        return false;
                    }
                } else {
                    smap[schar] = tchar;
                }

                if (tmap[tchar] != 1) {
                    if (tmap[tchar] != schar) {
                        return false;
                    }
                } else {
                    tmap[tchar] = schar;
                }
            }

            return true;
        }*/
    }
}