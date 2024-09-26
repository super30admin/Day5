// Time Complexity : O(n) where n is the number of characters of string
// Space Complexity : O(n) where n is the number of characters of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        String[] arr = str.replaceAll("\\s+"," ").split(" ");
        if(pattern.length() != arr.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            String ch = pattern.charAt(i)+"";
            String tmpStr = arr[i];
            
            if(map1.containsKey(tmpStr) && !map1.get(tmpStr).equals(ch))
                return false;
            if(map2.containsKey(ch) && !map2.get(ch).equals(tmpStr))
                return false;

                map1.put(tmpStr,ch);
                map2.put(ch,tmpStr);

        }
        return true;
    }
}