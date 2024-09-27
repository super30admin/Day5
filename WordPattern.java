// Time Complexity :O(n)...?
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : No one test case failed

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        Boolean result = false;
        for (int i = 0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String tempString = strArray[i];
            
            if(map.containsKey(pChar)){
                String tempVal = map.get(pChar);
                if(tempVal.equalsIgnoreCase(tempString)){
                    result = true;
                } else{
                    return false;
                }
            }
            else{
                map.put(pChar, tempString);
            }
        }
        return result;
    }
}