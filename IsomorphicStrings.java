//Two hashmaps with 1 to 1 mapping of chars when there is a mismatch is any one map break;
// O(n) - length of string

import java.util.*;
class IsomorphicStrings{

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmap = new HashMap<Character, Character>();
        HashMap<Character, Character> hmap1 = new HashMap<Character, Character>();
        if(s.length() != t.length())
            return false;
        
            for(int i=0;i<s.length();i++){
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if(hmap.containsKey(sChar)){
                    if(hmap.get(sChar) != tChar)
                        return false;
                }
                else{
                    hmap.put(sChar, tChar);
                }

                if(hmap1.containsKey(tChar)){
                    if(hmap1.get(tChar) != sChar)
                        return false;
                }
                else{
                    hmap1.put(tChar, sChar);
                }
            }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Isomorphic String");
        IsomorphicStrings obj = new IsomorphicStrings();
        String s = "ab";
        String t = "aa";
        System.out.println(obj.isIsomorphic(s, t));
    }
}