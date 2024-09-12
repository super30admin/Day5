// Time Complexity : O(N)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
Using Hashset, we will add the visited string/word in the set. 
Also we will store mapping of Character to String in HashMap.   

*/

class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || pattern == null)  return false;
        
        
        HashMap<Character, String> patternMap = new HashMap<>();
        
        
        Set<String> traversed = new HashSet<>();         
        String[] ss = s.split("\\s+");
        
        if(ss.length != pattern.length()) return false;
        for(int i = 0; i < pattern.length(); i++){
            char sC = pattern.charAt(i);
            String str = ss[i];
            
            if(patternMap.containsKey(sC)){
                if(! patternMap.get(sC).equals(str)){
                    return false;
                }
            }
            else{
                if(traversed.contains(str))  return false;
                
                patternMap.put(sC, str);
                traversed.add(str);
                
            }
        }
        
        return true;
     
    }
}


