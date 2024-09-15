// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, it was clear during today's class




class Anagrams
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
      HashMap<Long, List<String>> hm = new HashMap<>();  
     
      for(String s:strs)
      {
          long result = productCalculation(s);
          if(!hm.containsKey(result))
          {
              hm.put(result,new ArrayList<>());
          }
          hm.get(result).add(s);
      }
        return new ArrayList<>(hm.values());
    }
    
    public long productCalculation(String s)
    {
int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    long result = 1;    
    for(int i=0; i<s.length(); i++)
    {
        char c = s.charAt(i);
        result = result * primes[c-'a'];
        
    }
        return result;
    }
}