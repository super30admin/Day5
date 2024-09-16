// Time Complexity : O(n) 
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        //This Set is used to keep track of already assigned elements
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i< s.length(); i ++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                //If character already exists in hashmap, then we compare its key with char in 't'
                //If it is not equal then it is not Isomorphic
                if(map.get(ch) != t.charAt(i) ){
                    return false;
                }
            }
            else{
                //If the character is not in hashmap but the character in 't' has already assigned to other character then it is not Isomorphic
                if(set.contains(t.charAt(i)))
                    return false;
                set.add(t.charAt(i));
                map.put(ch, t.charAt(i));
            }
        }
        return true;
    }
}