// This would be following the same approach as the isomorphic strings but here one would be string and the other would be the words in the string. WE will convert the string of words into an array of Strings and the string would be the array of character. By iterating through the arrays and using two hashmaps we would be able to retain the isomorphic nature and find the similar word patterns between the string and the string of strings.

// Time complexity: O(n) where the n is the length of the string
// Space Complexity: O(n) since we are using two hashMaps.

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()==0 | s.length() == 0) return false;
        String[] givenStrings = s.split(" ");
        
        if(pattern.length() != givenStrings.length) return false;
        
        //logic
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> tMap = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String incoming = givenStrings[i];
            if(!map.containsKey(c)){
                map.put(c, incoming);
            }
            if(!map.get(c).equals(incoming)) return false;
            
            if(!tMap.containsKey(incoming)){
                tMap.put(incoming,c);
            }
            if(tMap.get(incoming) != c) return false;
        }
        
        return true;
    }
}