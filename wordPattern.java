// Time Complexity : O(nm) n is the array size and m is the character length in a word for this operation "hashmap.containsKey" 
// Space Complexity : O(n) since the number elements in the array are used multiple times and hence don't have a fixed usage count and also because of auxilary data structures like hashmap and list being used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public boolean wordPattern(String pattern, String str) {
        char [] patternArr = pattern.toCharArray();
        String[] strSplit = str.split("\\s+");
        int size = patternArr.length;
        HashMap<Character,String> hashmap = new HashMap<>();
        if(size!=strSplit.length)
        {
            return false;
        }
        for(int i =0;i<size;i++)
        {
            if(hashmap.containsKey(patternArr[i]))
            {
                String sec = strSplit[i];
                String fir = hashmap.get(patternArr[i]);
                if(!sec.equals(fir))
                {
                    return false;
                }
           
            }
            else
            {
                if(hashmap.containsValue(strSplit[i]))
                {
                    return false;
                }
                hashmap.put(patternArr[i],strSplit[i]);
            }
        }
        
        return true;
    }
}