// Time Complexity : O(n * k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Prime number issues


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0)
            return new ArrayList<>();
        
        HashMap<Long,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            long current=findUniqueValues(strs[i]);

            if(!map.containsKey(current))
                map.put(current,new ArrayList<String>());
            
            map.get(current).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private long findUniqueValues(String s)
    {
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    
        long result=1;
        
        for(char c: s.toCharArray())
            result*=primes[c-'a'];
        return result;
    }
}