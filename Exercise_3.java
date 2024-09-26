// Time Complexity :O(n)

// Space Complexity :o(n)

// Did this code successfully run on Leetcode :yes

// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        char[] patArray= pattern.toCharArray();
        String[] strArray = s.split(" ");
        if(strArray.length!=patArray.length) return false;
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            
            if(!map1.containsKey(patArray[i])){
                map1.put(patArray[i], strArray[i]);
            }else{
                if(!map1.get(patArray[i]).equals(strArray[i])) return false;
            }
            if(!map2.containsKey(strArray[i])){
                map2.put( strArray[i],patArray[i]);
            }else{
                if(!map2.get(strArray[i]).equals(patArray[i])) return false;
             }
            
     }
      return true;
}
}