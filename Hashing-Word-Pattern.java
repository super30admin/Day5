// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        HashMap<Character, String> hm = new HashMap<>();
        
        String arr[] = str.split(" "); //Splitting string based on empty space, storing into array
        
        if(arr.length!= pattern.length()) //Base case
            return false;
        
        for(int i=0;i<arr.length;i++){
            
            if(hm.containsKey(pattern.charAt(i))){  //Checking if key (pattern word)  already present and equal to string word
                
                if(!hm.get(pattern.charAt(i)).equals(arr[i])){
                    
                    return false;
                }
            }
                else{
                    if(hm.containsValue(arr[i])){ // If value already present, return false beacuse of same key-multiple value violation
                    
                        return false;
                    }
                    hm.put(pattern.charAt(i),arr[i]);
                
            }
        
        
    }
        return true;
}
}