// Time Complexity : O(n)
// Space Complexity : (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution{

    public booelan ismorfic(String s, String t){
        
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)!=t.charAt(i)){
                return false;
            }else if (!map.containsKey(c)){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(c, t.charAt(i));
            }
        }
        return true;
    }
}