//Time Complexity : O(N) for all operations 
//Space Complexity : O(1) for all operations
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length==0) return new ArrayList<>(); //check if the strs is already empty or not. if it is then return empty arraylist.
                                                                                    
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            long primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)) // check if the value is already present in the hashmap or not
            {
                map.put(primeProduct, new ArrayList<>()); // if the value is not there is the hashmap then add an empty arraylist as value.
            }
            map.get(primeProduct).add(s); // if the value is already present than get the value and add another value to the arraylist in the value corresponding to that value.
        }
        return new ArrayList<>(map.values()); // we are returning, an arraylist of all the values in the hashmap
    }
      private long primeProduct(String s)// private method to find unique result for each char in the strs.
      {
            int [] primenumbers = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
            long result =1;
            for(int i=0 ; i< s.length(); i++)
            {
                char c = s.charAt(i);
                result = result * primenumbers[c - 'a'];
            }
            return result;
        }
}