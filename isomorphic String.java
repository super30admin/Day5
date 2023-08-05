//Time Complexity = O(N)
//Space Complexity = O(2N)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++) {
            if(map1.get(s.charAt(i)) != t.charAt(i) || map2.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }
        return true;


    }
}