import java.util.HashMap;

// Time Complexity : O(nk) -> because s.split will run over every character in the while string s.
// Space Complexity : O(n) - > to put the values in sArray.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
public class Problem3 {
//approach is similar to isomorphic string, in here we're gonna create 2 map between the char and a string.
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        if(sArray.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> sMap = new HashMap<>();
        HashMap<String,Character> tMap =  new HashMap<>();
        for(int i=0;i<sArray.length;i++){
            char c = pattern.charAt(i);
            String s1 = sArray[i];
            if(sMap.containsKey(c)){
                if(!sMap.get(c).equals(s1)){
                    return false;
                }
            }
            else{
                sMap.put(c,s1);
            }
            if(tMap.containsKey(s1)){
                if(tMap.get(s1) != c){
                    return false;
                }
            }
            else{
                tMap.put(s1,c);
            }
        }
        return true;
    }
}
