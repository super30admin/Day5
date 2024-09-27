// Time Complexity :  n - String length
// Space Complexity : O(N) - for 2 hashmap (N + N = 2N = N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : n 


// Your code here along with comments explaining your approach
// 1) check if the length of both string and pattern are same
// 2) iterate through pattern - Store the character in the key for the first time and string charater as value
// 3) next time if the same charater comes it checks the map for the key and checks if the same value is present or returns false
// 4) Now String is considered as key and same process is repeated to avoid the vice versa failing scenario 


class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> sMap = new HashMap<>();
        HashMap<String,Character> tMap = new HashMap<>();
        
        String[] strArr = str.split(" ");
        if(strArr.length != pattern.length()){
            return false;
        }
        
        for(int i =0;i<pattern.length();i++){
            char c= pattern.charAt(i);
            
            if(!sMap.containsKey(c)){
                sMap.put(c,strArr[i]);
            }else{
                if(!sMap.get(c).equals(strArr[i])){
                    return false;
                }
            }
        }
        
        for(int i =0;i<strArr.length;i++){
            String s = strArr[i];
            
            if(!tMap.containsKey(s)){
                tMap.put(s,pattern.charAt(i));
            }else{
                if(!tMap.get(s).equals(pattern.charAt(i))){
                    return false;
                }
            }
        }
        
        return true;
    }
}
