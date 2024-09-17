/** Given an array of strings strs, group the anagrams together. You can return the answer in any order.
* Time complexity O(1) and space complexity is O(1). Using product of primes which will be unique for non anagrams we can avoid string sorting
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
	    	List<List<String>> groups = new ArrayList<List<String>>();
            Map<Long, List<String>> groupMap = new HashMap<Long, List<String>>();
	        if (strs == null || strs.length == 0)
	        {
	            return groups;
	        }
	     
			for (int i = 0; i < strs.length; i++) {
				Long product = primeProd(strs[i].toCharArray());
				if (groupMap.containsKey(product)) {
					List<String> set = groupMap.get(product);
					set.add(strs[i]);
					groupMap.put(product, set);
				} else {
					List<String> set = new ArrayList<String>();
					set.add(strs[i]);
					groupMap.put(product, set);
				}
			}
			  for (Map.Entry<Long, List<String>> entry : groupMap.entrySet())  
			  {
				  groups.add(entry.getValue());
			  }    
            return groups;
	    }
    
    private long primeProd(char[] input) {
        int[] primes = new int []{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        long product = 1;
        for (int i = 0; i < input.length;i++) {
           product = product * primes[input[i]-'a'];
        }
        return product;
    }
    
}
