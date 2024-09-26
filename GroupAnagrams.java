//Time complexity : O(nk+m) n is number of strs, k is length of each strs and m is to change the map values to list
//space complexity: O(n)
//Did run on leetcode.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            long p = prime(strs[i]);
        
        
            if(!map.containsKey(p))
            {
                map.put(p, new ArrayList<String>());			//Used prime product rule to calculate the string unique value and to match.
            }
           map.get(p).add(strs[i]);								//Using product as key and value to store the anagrams of that value.
            
         
        }
        return new ArrayList<>(map.values());				//converting map values to arraylist and returning.
    }
    
    long prime(String str)
    {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long out=1;
        for(int i=0;i<str.length();i++)
        {
            out = out * primes[str.charAt(i)-'a'];
        }
        
        return out;
    }
}