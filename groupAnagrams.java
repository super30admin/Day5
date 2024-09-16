// Time Complexity : O(nm) n is the array size and m is the character length in a word for this operation "Arrays.sort(word)" 
// Space Complexity : O(n) since the number elements in the array are used multiple times and hence don't have a fixed usage count and also because of auxilary data structures like hashmap and list being used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> anagram = new ArrayList<String>();
        List<List<String>> output = new ArrayList<>();
        HashMap<String,List<String>> hashmap = new HashMap<>();
        
        for(String s : strs)
        {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String key = new String (word);
            if(hashmap.containsKey(key))
            {
                
                List values = hashmap.get(key);
                values.add(s);
                hashmap.put(key,values);
            }
            else
            {
                List values = new ArrayList();
                values.add(s);
                hashmap.put(key,values);
            }
            
        }
        
        for(String key : hashmap.keySet())
        {
            output.add(hashmap.get(key));
        }
        
        return output;
    }
}