// Time Complexity - O(N)
// Space Complexity - O(1)
// Ran on LeetCode
// No issues

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())    return false;
        HashMap<Character, Character> mapping = new HashMap<>();
        HashSet<Character> assigned = new HashSet<>();
        char a, b;
        for(int i = 0; i < s.length(); i++){
            a = s.charAt(i);
            b = t.charAt(i);
            if(mapping.containsKey(a)) {
                if (mapping.get(a) != b) return false;
            } else{
                if(assigned.contains(b))    return false;
                mapping.put(a, b);
                assigned.add(b);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("egg", "abb"));
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
