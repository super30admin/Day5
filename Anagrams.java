//Time Complexity: O(nk log k)
//Space Complexity : O(n)
// Executed in leetcode: Yes


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null ||strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i =0; i<strs.length ;i++)
        {
            String str = strs[i]; // took a word in strs and assigned to str
            char[] charArray = str.toCharArray(); //converting the word to char array to sort
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray); // valueOf() converts char array into string
            
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}