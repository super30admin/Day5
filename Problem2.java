class Solution {
    public boolean isIsomorphic(String pattern, String str) {
        
        if (pattern.length() != str.length()) {
            return false;
        }
        
        HashMap<Character, Character> myMap = new HashMap();
        HashMap<Character, Character> myMap2 = new HashMap();
        
        for (int index=0; index < str.length(); index++) {
            Character p = pattern.charAt(index);
            Character s = str.charAt(index);
            
            if (myMap.containsKey(p)) {
                if (myMap.get(p).equals(s)) {
                    
                } else {
                    return false;
                }
            } else {
                myMap.put(p, s);
            }
            if (myMap2.containsKey(s)) {
                if (myMap2.get(s).equals(p)) {
                    
                } else {
                    return false;
                }
            } else {
                myMap2.put(s, p);
            }
        }

        
        return true;
    }
}
