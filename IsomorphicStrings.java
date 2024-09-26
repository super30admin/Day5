// Time Complexity O(n) - N: Number of chars in s or t.
// Space Complexity O(1) - Finite number of characters can be added at max
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++) {
            Character ch= s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) != t.charAt(i) || !map.containsKey(ch) && set.contains(t.charAt(i))) {
                return false;
            }
            
            if(!map.containsKey(ch)) {
                map.put(ch, t.charAt(i));
                set.add(t.charAt(i));
            }
            
        }
        
        return true;
    }
}
