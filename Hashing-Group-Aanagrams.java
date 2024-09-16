// Time Complexity : O(nmlogm)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm = new HashMap<>(); //Creating a hash map with String and a List of strings
        
        for (int i=0;i<strs.length;i++){
            
            char[] ch = strs[i].toCharArray(); // Converting each string to char array. eat, tea nad ate will be sorted "aet"
            Arrays.sort(ch);                    // Sorting the char array
            
            String sorted = String.valueOf(ch); //Converting back to string
            
            if(!hm.containsKey(sorted)){        //Adding to Hash Map for the first time. "aet" will have [ate,tea,eat]
                hm.put(sorted, new ArrayList<>());
            }
            
            hm.get(sorted).add(strs[i]);        //Directly adding it to the exisiting or newly created list
        }
        
        return new ArrayList<>(hm.values());       //Returning the grouped list
        
    }
}