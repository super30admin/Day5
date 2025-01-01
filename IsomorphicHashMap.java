// Time Complexity : O(n) where n is length of s/t
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package Hashing1;

import java.util.HashMap;

class IsomorphicHashMap {
    /*
    add every ele in hashmap and reverse map with next string, if any mismatch return false or return true
     */
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(smap.containsKey(s.charAt(i))){
                if(t.charAt(i)!=smap.get(s.charAt(i))){
                    return false;
                }
            } else {
                smap.put(s.charAt(i), t.charAt(i));
            }
            if(tmap.containsKey(t.charAt(i))){
                if(s.charAt(i)!=tmap.get(t.charAt(i))){
                    return false;
                }
            } else {
                tmap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new IsomorphicHashMap().isIsomorphic("egg","add"));
        System.out.println(new IsomorphicHashMap().isIsomorphic("foo","bar"));
    }
}