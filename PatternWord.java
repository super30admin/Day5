// Time Complexity : O(N) 
// Space Complexity : O(N) - Having HashMap
// Did this code successfully run on Leetcode : NO
// Any problem you faced while coding this : 

class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] arrOfStr = str.split(" "); 
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i = 0; i< arrOfStr.length-1; i++){
            String s = arrOfStr[i];
            Character c = pattern.charAt(i);
            
            if(map.containsKey(c)){
                System.out.println(s + " " + map.get(c));
                System.out.println(map.get(c).equals(s));
                if(!map.get(c).equals(s)){
                    return false;
                }
            }
            else{
                map.put(c,s);
                System.out.println(c + " " + map.get(c));
            }
        }
        return true;
        
    }
}