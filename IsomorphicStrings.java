// in this approach we will be using a hashmap and set to track the alphabets that are mapped to the character in the string ensuring that no character will map to two different characters, which will help us to ensure the isomorphic nature of both the strings.

// Time complexity: in worst case if both the strings are isomorphic we will be iterating through the string length which would result in O(n)

// Space complexity: Since we are using a Hashmap, the space complexity would be O(n).

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // check if the strings are null
        if(s.length()==0 || t.length()==0) return false;
        // check if the string lengths are equal
        if(s.length()!=t.length()) return false;
        //logic
        HashMap<Character,Character> sMap = new HashMap<>();
        //HashMap<Character,Character> tMap = new HashMap<>();
        HashSet<Character> tChar = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar) return false;
            }
            else{
                sMap.put(sChar,tChar);
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar) return false;
            }
            else{
                tMap.put(tChar,sChar);
            }
        }
        return true;
        
    }
}