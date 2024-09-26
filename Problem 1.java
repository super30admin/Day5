// Time Complexity : O(nk)
// n is the length of each  strs and k is the average length of each string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i = 0;i< strs.length ; i++)
        {
            String str = strs[i];
            double prime_multiply = prime(str);
            if(!map.containsKey(prime_multiply))
            {
                map.put(prime_multiply,new ArrayList<>());
            }
            map.get(prime_multiply).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
    
    
    private double prime(String str)
    {
        int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double value = 1;
        
        for(int i=0;i < str.length() ;i++)
        {
            char c = str.charAt(i);
            value = value * primes[c - 'a'];
        }
        return value;
    }
}