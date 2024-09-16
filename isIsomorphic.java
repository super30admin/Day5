// Time Complexity : O(nm) n is the array size and m is the character length in a word for this operation "hashmap.containsKey" 
// Space Complexity : O(n) since the number elements in the array are used multiple times and hence don't have a fixed usage count and also because of auxilary data structures like hashmap and list being used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char [] first = s.toCharArray();
        char [] second = t.toCharArray();
        int size = first.length;
        HashMap<Character,Character> hashmap = new HashMap<>();
        for(int i =0;i<size;i++)
        {
            if(hashmap.containsKey(first[i]))
            {
                char sec = second[i];
                char fir = hashmap.get(first[i]);
                if(sec != (fir))
                {
                    return false;
                }
           
            }
            else
            {
                if(hashmap.containsValue(second[i]))
                {
                    return false;
                }
                hashmap.put(first[i],second[i]);
            }
        }
        
        return true;
        
    }
}