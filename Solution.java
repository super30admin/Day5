
//Time Complexity: O(n*k(log(k))
//Space Complexity: O(n*k)  k is the length of each word to be sorted

public class Solution {
	 public List<List<String>> groupAnagrams(String[] strs) {
	        if(strs == null || strs.length == 0) new ArrayList<>();

	        HashMap<String, List<String>> map = new HashMap<>();

	        for(String s: strs){
	            char[] charArr = s.toCharArray();
	            Arrays.sort(charArr);
	            String sorted = String.valueOf(charArr);
	            if(!map.containsKey(sorted)){
	                map.put(sorted, new ArrayList<>());
	            }
	            map.get(sorted).add(s);
	        }

	        return new ArrayList<>(map.values());
	    }
	}
