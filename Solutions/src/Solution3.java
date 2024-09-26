// Time Complexity :
// O(n)
//// Space Complexity :O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
import java.util.HashMap;

class Solution3 {
    public boolean wordPattern(String pattern, String str) {
        String[] arr= str.split(" ");
        if (pattern.length()!=arr.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String s = arr[i];
            if(map.containsKey(p)){
                if(!map.get(p).equals(s)){
                    return false;
                }
            }
            else{
                if(!map.containsValue(s)){
                    map.put(p,s);
                }
                else{
                    return false;
                }
            }
        }


        return true;
    }
}