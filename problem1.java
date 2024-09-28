// Time Complexity : O(nk) n = array length, k = avg length of each element
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach
class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<Double, List<String>> res = new HashMap<>();
		 
		 for(int i = 0; i < strs.length; i++) {
			  double primeprod = primeProduct(strs[i]);
			  if(!res.containsKey(primeprod)) {
					res.put(primeprod, new ArrayList<>());
			  }
			  res.get(primeprod).add(strs[i]);
		 }
		 return new ArrayList<>(res.values());
	}
	
	private double primeProduct(String s) {
		 double res = 1;
		 int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
		 for(int i = 0; i<s.length(); i++) {
			  char c = s.charAt(i);
			  int prime = primes[c-'a'];
			  res *= prime;
		 }
		 return res;
	}
}