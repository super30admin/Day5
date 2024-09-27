// Time Complexity : O(n)
// Space Complexity : O(1) as max mapping will be constant (a-z + A-Z) = 52
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no
// Time taken : 26 mins + 15 for mapping

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(mapS.containsKey(sc)){
                if(mapT.containsKey(tc)){
                    if(mapT.get(tc) != sc)
                        return false;
                }
                else if(mapS.get(sc) != tc)
                    return false;
            }
            else if(mapT.containsKey(tc)){
                if(mapS.containsKey(sc)){
                    if(mapS.get(sc) != tc)
                        return false;
                }
                else if(mapT.get(tc) != sc)
                    return false;
            }
            else {
                mapS.put(sc, tc);
                mapT.put(tc, sc);
            }
        }
        return true;
    }

    // In this method we can map the string onto an array by the position where the char in string occurs
    // "paper" will be mapped as [0,1,0,3,4]
    public static boolean isIsomorphicUsingStringMapping_UsingList(String s, String t){
        return transformToArrayList(s).equals(transformToArrayList(t));
    }
    public static List<Integer> transformToArrayList(String s){
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> posArray = new ArrayList<>();
        int i=0;
        for(char c : s.toCharArray()){
            // First occurence of the char, add to map
            if(!map.containsKey(c))
                map.put(c, i);

            // Add index position where the char occurs
            posArray.add(map.get(c));
            i++;
        }
        return posArray;
    }


    //We can also map the string to string of numbers
    // "paper" will be mapped as "0,1,0,3,4"
    public static boolean isIsomorphicUsingStringMapping_UsingString(String s, String t){
         return transformToString(s).equals(transformToString(t));
    }

    public static String transformToString(String s){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(char c : s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c, i);
                sb.append(map.get(c));
                sb.append(",");
                i++;
        }
         return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("pape", "title"));

        System.out.println(isIsomorphicUsingStringMapping_UsingList("paper", "title"));
        System.out.println(isIsomorphicUsingStringMapping_UsingList("badc", "baba"));
        System.out.println(isIsomorphicUsingStringMapping_UsingList("pape", "title"));

        System.out.println(isIsomorphicUsingStringMapping_UsingString("paper", "title"));
        System.out.println(isIsomorphicUsingStringMapping_UsingString("badc", "baba"));
        System.out.println(isIsomorphicUsingStringMapping_UsingString("pape", "title"));
    }
}
