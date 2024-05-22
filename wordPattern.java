/*
 * Approach: 
 * 
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

 class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] strs = s.split(" "); // splitting string on quotes
        if(pattern.length() != strs.length){
            return false;
        }

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strs[i];
            // check and add value to pattern map
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(str)){
                    return false;
                }
            } else {
                pMap.put(pChar, str);
            }
            // check and add value to str map
            if(sMap.containsKey(str)){
                if(sMap.get(str) != pChar){
                    return false;
                }
            } else {
                sMap.put(str, pChar);
            }
        }
        return true;
    }
}