// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : yes
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> sMap = new HashMap<>();
        HashMap<String,Character> tMap = new HashMap<>();
        String str[] = s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(sMap.containsKey(pattern.charAt(i)) && !(sMap.get(pattern.charAt(i)).equals(str[i]))){
                return false;
            }
            if(tMap.containsKey(str[i]) && !(tMap.get(str[i]).equals(pattern.charAt(i)))){
                return false;
            }
            sMap.put(pattern.charAt(i), str[i]);
            tMap.put(str[i], pattern.charAt(i));
        }
        return true;
    }
}
