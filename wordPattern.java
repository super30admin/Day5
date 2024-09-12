import java.util.HashMap;

//Time complexity:O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :no

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
    String arr[]=s.split(" ");
    if(pattern.length()!=arr.length) return false;
    HashMap<Character,String> hm = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        char ch = pattern.charAt(i);
        if(hm.containsKey(ch)){
            if(!hm.get(ch).equals(arr[i])) return false;
        }
        else if(!hm.containsValue(arr[i])){
            hm.put(ch,arr[i]);
        }else return false;
    }
    
    return true;
}
}
