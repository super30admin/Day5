// 49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char [] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
         
        return new ArrayList<>(map.values());
    }
}


// Complexity Analysis
/*
Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs.
Space Complexity: O(NK), the total information content stored in ans
*/