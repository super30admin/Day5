// Time Complexity : O(2n)~O(n) where n is length of each string
// Space Complexity : O(2n) for the HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {

        //Sanitation check - if two are not equal then hashmap doesn't work
        if(s.length()!=t.length()) return false;


        //Creating two hashmaps for two character -> character matching
        Map<Character, Character> stoTMap = new HashMap<>();
        Map<Character, Character> ttoSMap = new HashMap<>();


        //Iterate through each character in each string, length be can be any string length b/w two
        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            //stot
            //We check if at stoTMap contains chS and wehether that is equal to chT at same index - If later condition is false then there is no further comparision needed.
            if(stoTMap.containsKey(chS) && stoTMap.get(chS)!=chT){
                return false;
            }
            //else put value into stoTMap
            else{
                stoTMap.put(chS,chT);
            }

            //ttos
            //We check if at ttoSMap contains chS and wehether that is equal to chS at same index - If later condition is false then there is no further comparision needed
            if(ttoSMap.containsKey(chT) && ttoSMap.get(chT)!=chS){
                return false;
            }
            //else put key,value into ttoSMap
            else{
                ttoSMap.put(chT,chS);
            }
        }
        return true;
    }
}
