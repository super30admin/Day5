// Time Complexity : O(n) where n is the length of input string
// Space Complexity : O(n) where n is number of entries in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Looking for other approaches in class

//Same as the isomorphic program, we can map character at pattern to the word in the string
//split the string into array, as it is space by single space, used split function
//run a loop through the pattern, try to map character with its corresponding word
//when there is a mismatch, return false

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr=str.trim().split("\\s");
       
        if(pattern.length()!=arr.length ) return false;
        HashMap<Character, String> res=new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            if(!res.containsKey(pattern.charAt(i))){
                if(res.containsValue(arr[i])){
                    return false;
                }
            res.put(pattern.charAt(i),arr[i]);
        }
            else if(!res.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }
        
    }
        return true;
}
}