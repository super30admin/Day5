import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/
//Time complexity O(N)
//Space complexity O(1) as space could not be more than the character set
public class Problem2 {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> st1 = new HashMap<>();
        HashMap<Character,Character> st2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!st1.containsKey(sc)){
                st1.put(sc,tc);
            }else{
                if(!st1.get(sc).equals(tc)){
                    return false;
                }
            }
            if(!st2.containsKey(tc)){
                st2.put(tc,sc);
            }else{
                if(!st2.get(tc).equals(sc)){
                    return false;
                }
            }
        }
        return true;
    }
}
