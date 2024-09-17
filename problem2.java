/*

Big O: Time O(N) where N is the length of the strings
Space: O(N), where N is the length of the strings 

Passed All Test Cases 

Little different approach but the underlying idea is the same 
Using hashmap, I mapped each key (char in s) with their value (char in t). 
And, then I checked for the repeating values, if the repeating values existed, that means one key mapped to two values or one value mapped to multiple key, func returns false


*/
    public boolean isIsomorphic(String s, String t) {
        //edge case 
        if (s.length() != t.length()) return false;
        
        //we use hashmap to store the mapped values for each char
        HashMap<Character, Character> map = new HashMap<>() ; 
        for (int i = 0 ; i < s.length() ; i++) {
            //key and value pair
            char key = s.charAt(i); 
            char value = t.charAt(i);

            //if key is not present 
            if (!map.containsKey(key)) {
                //if key is not present but value is mapped for other key, return false
                if(map.containsValue(value)) return false ; 

                //else put key value
                map.put(key, value); 
                continue ; 
                //if key is present, then check for the value, if value is same as char in t then good else false
            } else if (map.containsKey(key)) {
                if (map.get(key) != value) return false ; 
            }
        }
        
        return true ; 
    }
}