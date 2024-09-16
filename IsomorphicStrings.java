import java.util.*;

public class IsomorphicStrings {
        /*

        Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
        Example 1: Input: s = "egg", t = "add" Output: true
        Example 2: Input: s = "foo", t = "bar" Output: false
        Example 3: Input: s = "paper", t = "title" Output: true
        Note: You may assume both s and t have the same length.

        TC :O(n) where n is size of string
        SC : O(1) as we will have only finite number of letters which does not change with the size of imput
        */

    public boolean IsIsomprphic(String s,String t){
        /*
        // using two hashMaps
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar,tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }
            else{
                tMap.put(tChar,sChar);
            }
        }
        */

        //using hashmap and a hashSet
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> sMap=new HashMap<>();
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
            else{
                if(set.contains(tChar)){
                    return false;
                }
                sMap.put(sChar,tChar);
                set.add(tChar);
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s="foo";
        String t="bar";

        IsomorphicStrings ga=new IsomorphicStrings();
        boolean result= ga.IsIsomprphic(s,t);

        System.out.println(result);

    }
}
