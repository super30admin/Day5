class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
        {return new ArrayList();}
        Map<String, List> anagrams = new HashMap<String , List>();
        for (String s : strs)
        {
            char[] c= s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList());
                anagrams.get(key).add(s);
            
        }
        return new ArrayList(anagrams.values());
    }
}

// Time Complexity : O(N*K*log K), where N is the number of token, K is length of longest token
// Space Complexity : O(N*K) where N is the number of token, K is length of longest token
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : had to lookup the functions of hashmap.
