// Time Complexity : O(NMlogM) M-size of longest word, N-no of words
// Space Complexity : O(n) where n is number of entries in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Looking for better solution in class

//Initialized a hashmap data structure with string key, and list of strings as value
//Run a loop through array of strings, for each word, try to sort it and store in hashmap 
//for the anagrams, after sorting the key is gonna be same, so they are going to be grouped together
//hence taking a new arraylist if anagrams are found to store near the same key
//returning the list of lists 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> res= new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String word=new String(c);
            if(!res.containsKey(word)) res.put(word, new ArrayList());
            res.get(word).add(s);
        }
        return new ArrayList(res.values());
    }
}