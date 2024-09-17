/*

Complexity: Time O(N) and Space O(1)

Passsed All Test Cases 

Solution: Using HashMap, we map each word to a char, and then check if there is no double mapping. 

*/


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String [] s = str.split(" ") ;
        if (s.length != pattern.length()) return false ; 
        HashMap<Character, String> map = new HashMap<>(); 
        
        for (int i = 0 ; i < s.length ; i++) {
            String value = s[i] ; 
           
            char key = pattern.charAt(i) ; 
            if (!map.containsKey(key)) {
                if (map.containsValue(value)) return false; 
                map.put(key, value); 
            } else if (!map.get(key).equals(value)) return false;
        }
        
        return true ; 
    }
}