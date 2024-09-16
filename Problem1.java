Time Complexity: O(nl). n is number of strings. l is average length of string. If we ignore string length then it will be O(n).
Space Complexity: O(n). At most, we will have n entries in HashMap.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int[] primeFactor = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        HashMap<Long,List<String>> map = new HashMap<>();
        long intValue = 1;
        
        for(String s : strs) {
        	
        	for(int i = 0; i < s.length(); i++) {
        		intValue *= primeFactor[s.charAt(i) - 'a'] * s.charAt(i);
        	}
        	
        	if(!map.containsKey(intValue)) {
        		map.put(intValue, new ArrayList<String>());
        	}
        	
        	map.get(intValue).add(s);
            intValue = 1;
        }
        
        return new ArrayList<>(map.values());
    }
}
