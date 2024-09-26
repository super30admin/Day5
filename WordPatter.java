// Time Complexity O(n) - n number of patterns
// Space Complexity O(1) - as there can be max 26 characters else the condition will break
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap<>();
        
         String[] str = s.split(" ");
        
        if(str.length != pattern.length()) return false;
        
        for(Integer i =0; i<str.length; i++) {
            Character character = pattern.charAt(i);
            String word = str[i];
               
            if(!map.containsKey(character)) {
                map.put(character, i);
            }
            
            if(!map.containsKey(word)) {
                map.put(word, i);
            }
            
            if(map.get(character) != map.get(word)) return false;
            
        }
        
        return true;
    }
}
