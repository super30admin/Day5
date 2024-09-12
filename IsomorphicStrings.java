package S30.Hashing1;


/*
 * Successfully executed on leetcode
 * Time complexity: iterated over both string only once, so it will be O(n) where n is size of string
 * Space Complexity: here we are using 2 hashmaps space taken will be O(n+n) => O(n)
 * */

/* Approach: we map both s string letters to t string and vice versa in two hashmaps
 *           we check both maps while inserting element into maps. If it's already present compare with
 *           current value with the one existing value in hashmap.
 * */


import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String args[]){
        System.out.print(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> mapStoT = new HashMap<>();
        Map<Character, Character> mapTtoS = new HashMap<>();
        for(int i=0, j=0; i<s.length() ; i++, j++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(j);
            if(mapStoT.containsKey(sChar) && (mapStoT.get(sChar) != tChar)){
                return false;
            }else{
                if(mapTtoS.containsKey(tChar) && (mapTtoS.get(tChar) != sChar)){
                        return false;
                }else{
                    mapStoT.put(sChar, tChar);
                    mapTtoS.put(tChar,sChar);
                }
            }
        }
        return true;
    }
}
