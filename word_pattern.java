
// Time Complexity : O(2n)~O(n) where n is length of each string
// Space Complexity : O(2n) for the HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {

         //Creating two hashmaps for two character -> string  mapping and vice versa
        Map<Character, String> ptoSMap = new HashMap<>();
        Map<String, Character> stoPMap = new HashMap<>();

        //splitting string at space for mapping
        String[] strs = s.split(" ");

       //Sanitation check - if two are not equal then hashmap doesn't work
        if(strs.length!=pattern.length()) return false;

        //Iterate through each character in each string, length be can be any string length b/w two
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String str = strs[i];

            //We check if at ptoSMap contains ch and wehether that is equal to str at same index - If later condition is false then there is no further comparision needed.
            if(ptoSMap.containsKey(ch) && !(ptoSMap.get(ch).equals(str))){
                return false;
            }
            //else put value into ptoSMap
            else{
                ptoSMap.put(ch,str);
            }

            if(stoPMap.containsKey(str) && stoPMap.get(str)!=ch){
                return false;
            }
            else{
                stoPMap.put(str,ch);
            }

        }
        return true;
    }
}
