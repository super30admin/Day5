/**
 * Time Complexity: O(n) where n = String length
 * Space Complexity :O(n) where n = String length
 */

import java.util.*;
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int idx = 0; idx < s.length(); idx++) {
            Character sChar = s.charAt(idx);
            Character tChar = t.charAt(idx);
            if (map.containsKey(sChar)) { //if a mapping exists
                if (map.get(sChar) != tChar) return false; 
            } else { // if there isn't any sChar key
                if (map.containsValue(tChar)) return false; 
                map.put(sChar, tChar);
            }
        }
        return true;
    }
    public static void main(String args[]){
        Isomorphic obj = new Isomorphic();
        String s = "paper";
        String t = "title";
;        System.out.println(obj.isIsomorphic(s, t));
    }
}