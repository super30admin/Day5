// Time Complexity :O(N)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

//hashMap + hashSet
public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()) return false; // checking if the length of the strings are not equal then returning in starting
    // HashMap + HashSet. hashSet is used to store the elements of second string added in order to get O(1) TC for searching
    HashMap<Character,Character> map = new HashMap<>(); // creating a hashmap to store values
    // map<string s, string t>
    HashSet<Character> tSet = new HashSet<>();
    
    for(int idx =0;idx<s.length();idx++){ // itearting 
        char sChar = s.charAt(idx);
        char tChar = t.charAt(idx);
        if(map.containsKey(sChar)){ // if the hashmap contains the key
            if(map.get(sChar) != tChar){ // if the value of the particular key doesn't match the character in other string then return false
                return false;
            }
        } else{ // if hashmap doesn't contain the key
            if(tSet.contains(tChar)){ // if the set contains this character it means it is already mapped to some other character from other string than the current one, so return false
                return false;
            }
            map.put(sChar,tChar);
            tSet.add(tChar);
        }
    }
    return true; // it it matches then return true
}

        if(s.length() != t.length()) return false; // checking if the length of the strings are not equal then returning in starting
        
        //Using arrays to map the values
        char[] sMap = new char[100]; // every value is initialized to 0
        char[] tMap = new char[100];
        
        for(int idx=0;idx<s.length();idx++){
            char sChar = s.charAt(idx);
            char tChar = t.charAt(idx);
            if(sMap[sChar -' '] != 0){ // calculating the index of this character by a hashing function and checking if it is present or not
                if(sMap[sChar - ' '] != tChar){ // if the value is not equal to corresponding value in t array
                    return false;
                }
            }else{ // means value is not present
                sMap[sChar - ' '] = tChar;
            }
            
            if(tMap[tChar -' '] != 0){
                if(tMap[tChar - ' '] != sChar){
                    return false;
                }
            }else{
                tMap[tChar - ' '] = sChar;
            }
        }
        
        return true; 
    }

    //Arrays used instead of hashmap
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false; // checking if the length of the strings are not equal then returning in starting
        
        //Using arrays to map the values
        char[] sMap = new char[100]; // every value is initialized to 0
        char[] tMap = new char[100];
        
        for(int idx=0;idx<s.length();idx++){
            char sChar = s.charAt(idx);
            char tChar = t.charAt(idx);
            if(sMap[sChar -' '] != 0){ // calculating the index of this character by a hashing function and checking if it is present or not
                if(sMap[sChar - ' '] != tChar){ // if the value is not equal to corresponding value in t array
                    return false;
                }
            }else{ // means value is not present
                sMap[sChar - ' '] = tChar;
            }
            
            if(tMap[tChar -' '] != 0){
                if(tMap[tChar - ' '] != sChar){
                    return false;
                }
            }else{
                tMap[tChar - ' '] = sChar;
            }
        }
        
        return true; 
    }