// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Isomorphic {

    static boolean isomorphic(String s, String t){

        HashMap <Character ,Character> sToTMap = new HashMap<Character, Character>();
        Set<Character> tSet = new HashSet<>();


        for (int  i = 0 ; i < s.length() ; i ++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sToTMap.containsKey(sChar)){
                if(sToTMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                if (tSet.contains(tChar)){
                    return false;
                }
            }
            sToTMap.put(sChar, tChar);
            tSet.add(tChar);
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(Isomorphic.isomorphic("egg","adf"));
    }

}
