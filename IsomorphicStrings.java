// Time Complexity : O(3n) = O(n) where n is the length of String pattern
// Space Complexity : O(n), n is the length of String pattern
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))==t.charAt(i)){
                    //Everything's good!
                }
                else{
                    return false;
                }
            }
            else{
                if(set.contains(t.charAt(i))){
                    return false;
                }
                else{
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.isIsomorphic("egg","add"));
        System.out.println(is.isIsomorphic("foo","bar"));
        System.out.println(is.isIsomorphic("paper","title"));
        System.out.println(is.isIsomorphic("badc","baba"));
    }
}