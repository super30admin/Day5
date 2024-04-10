/*Time  complexity  O(n)
 * Space complexity O(n)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/


class Solution {
//using 1hashset and 1map
    public static boolean isIsomorphic2(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (tSet.contains(tChar)){
                    return false;
                }
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
          
        }
        return true;
    }
    //using 2maps.
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {// key is present
                if (sMap.get(sChar) != (tChar)) {// check if key value is != tChar
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != (sChar)) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }

}
