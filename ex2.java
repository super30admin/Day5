//Time and Complexity:O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s_map = new HashMap<>();
        Map<Character, Character> t_map = new HashMap<>();
        char[] s_chars = s.toCharArray(), t_chars = t.toCharArray(); //  cahr 
        for (int i = 0; i < s_chars.length; i++) {
            // 
            if (s_map.containsKey(s_chars[i]) && s_map.get(s_chars[i]) != t_chars[i]) return false;
            if (t_map.containsKey(t_chars[i]) && t_map.get(t_chars[i]) != s_chars[i]) return false;
            s_map.put(s_chars[i], t_chars[i]);
            t_map.put(t_chars[i], s_chars[i]);
        }
        return true;
    }
}