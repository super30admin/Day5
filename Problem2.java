class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;
        
        // Create a HashMap and store all combinations of s and t
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            char x = s.charAt(i);
            char y = t.charAt(i);
            
            if (map.containsKey(x)) {
                if (map.get(x) != y) {
                    return false;
                }
            } else {
                if(map.containsValue(y)) {
                    return false;
                }
                map.put(x, y);
            }
        }
        return true;
    }
}