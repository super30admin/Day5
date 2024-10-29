// Time Complexity : O(n) # string length
// Space Complexity : O(1) # constant
// Approach : Using character Array's with valid ASCII values.  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // s -> e g n a
        // t -> a d d f
        if(s==null && t==null) return true;
        if(s==null || t==null) return true;
        if(s.length() !=t.length()) return false;

        char[] sMap = new char[95]; // [] valid ascii characters starts from 32 to 126 = 95
        char[] tMap = new char[95]; // []

        for(int i=0; i<s.length();i++){
           char sChar = s.charAt(i); // e g n
           char tChar = t.charAt(i); // a d d

           if(sMap[sChar - ' ']!=0){
                if(sMap[sChar - ' '] != tChar) return false;
           } else{
            sMap[sChar - ' '] = tChar;
           }

           if(tMap[tChar - ' ']!=0){
                if(tMap[tChar- ' ']!= sChar) return false;
           } else{
            tMap[tChar - ' ']= sChar;
           }
        }
        return true;

    }
}

// Time Complexity : O(n) # string length
// Space Complexity : O(1) # constant
// Approach : Using character Array's.  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // s -> e g n a
        // t -> a d d f
        if(s==null && t==null) return true;
        if(s==null || t==null) return true;
        if(s.length() !=t.length()) return false;

        char[] sMap = new char[256]; // [] valid ascii characters starts from 32 to 126 
        char[] tMap = new char[256]; // []

        for(int i=0; i<s.length();i++){
           char sChar = s.charAt(i); // e g n
           char tChar = t.charAt(i); // a d d

           if(sMap[sChar - ' ']!=0){
                if(sMap[sChar - ' '] != tChar) return false;
           } else{
            sMap[sChar - ' '] = tChar;
           }

           if(tMap[tChar - ' ']!=0){
                if(tMap[tChar- ' ']!= sChar) return false;
           } else{
            tMap[tChar - ' ']= sChar;
           }
        }
        return true;

    }
}


// Time Complexity : O(n) # string length
// Space Complexity : O(1) # constant
// Approach : Every Unique Character of string S should map with the unique Character of string t. if a particular character is mapping to 2 characters in second string that means it is not ismorphic. 
// Build just one hashmap either for s or t and while inserting tchar into sMap, check the tchar value in hashset if not exists in hashSet then add to hashSet and add tchar to sMap.  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // s -> e g n a
        // t -> a d d f
        HashMap<Character, Character> sMap = new HashMap<>(26);
        HashSet<Character> set = new HashSet<>(26);

        for(int i=0; i<s.length();i++){
           Character sChar = s.charAt(i); // e g n
           Character tChar = t.charAt(i); // a d d

           if(sMap.containsKey(sChar)){ // g
                if(sMap.get(sChar)!=tChar) return false;
           } else{
                if(set.contains(tChar)) return false; // {'a','d'}
                set.add(tChar);// {'a' ,'d'}
                sMap.put(sChar,tChar); // {'e':'a','g':'d'}
           }
        }
        return true;

    }
}

// Time Complexity :
// Space Complexity : O(1) # constant
// Approach : Every Unique Character of string S should map with the unique Character of string t. if a particular character is mapping to 2 characters in second string that means it is not ismorphic. Build two hashmaps one each for the s and t by iterating any one of the string. 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null) return true;
        if(s==null && t==null) return true;
        if(s.length()!=t.length()) return false;

       Map<Character,Character> sMap = new HashMap<>();
       Map<Character,Character> tMap = new HashMap<>();
    
       // "egg"
       for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i); // e g g , f o o 
            char tChar = t.charAt(i); // a d d , b a r

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar) return false;

            } else{
                sMap.put(sChar,tChar); //{'e':'a','g':'d'}, {'f':'b','o':'a'}
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) !=sChar) return false;
            } else{
                tMap.put(tChar,sChar); // {'a':'e','d':'g'}, {'b':'f','a':'o'}
            }

       }
       return true;
    }
}