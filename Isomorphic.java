// Overall Time Complexity : O(n). The n is number of characters in the string
// Overall Space Complexity : O(1). The space complexity is O(1) because of the string s and t consists of 128 characters of fixed length.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

//For each character in string s as the key, map the corresponding character from string t as the value in the hashmap.
//Check if the character from t has already been used by another character in s before storing it in the hashmap.
//Also, check if the value from t for the existing key in the hashmap matches the current value from t.

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> hmap = new HashMap<>();
       HashSet<Character> hset = new HashSet<>();

       int sl = s.length();
       int tl = s.length();

       if(sl!=tl){
        return false;
       }
       for(int i=0; i<sl;i++){
        char st = s.charAt(i);
        char ts = t.charAt(i);

        if(!hmap.containsKey(st)){
            if(hset.contains(ts)) return false;
            hmap.put(st,ts);
            hset.add(ts);

        }
        else{
               if(hmap.get(st)!=ts) return false;
            }
            
        }
        
       return true;
    }

} 
