// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = sArray[i];
            if(map.containsKey(c)){
                if(!str.equals(map.get(c))){
                    return false;
                }    
            }
            else{
                if(set.contains(str))
                    return false;
            }
            map.put(c,str);
            set.add(str);
        }
        return true;
    }
}
