// Time Complexity : O(nklogk), where n is the length of the input array and k is the length of the longest string
// Space Complexity : O(n), where n is the length of the input array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length ==0) return new ArrayList();
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] c = s.toCharArray();
            char[] key = new char[26];
            for(char ch : c) key[ch - 'a']++;
            List<String> val = map.getOrDefault(String.valueOf(key), new ArrayList());
            val.add(s);
            map.put(String.valueOf(key), val);
        }
        return new ArrayList(map.values());
    }
}

