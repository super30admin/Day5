/*
Group Anagrams.
Time Complexity: O(n*k) n: number of string given, k: the length of the longest string as we are going to convert each one 
of them into a chr then sort and again put into str so K;
Space Complextity: O(n*k);
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        
        List<List<String>> groupedanagrams = new ArrayList();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String str : strs)
        {
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String sorted = new String(chrs);
            
            if(! map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}