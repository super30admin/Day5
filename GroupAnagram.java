// Time Complexity :O(n)
// Space Complexity :O(n) -- For Hashmap. Although I am using some space for signature but i.e constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing
class GroupAnagram {
    public  List<List<String>> groupAnagrams(String[] strs) {
        // Generate signature of each string and put it in  Hashtable;
        // return the values of hash table
        HashMap<String,List<String>> dict = new HashMap<>();
        for(String s:strs)
        {
            String signature = getSignature(s);
            if(!dict.containsKey(signature))
            {
                dict.put(signature,new ArrayList<String>());   
            }
            dict.get(signature).add(s);
        }
        return new ArrayList<List<String>>(dict.values());
        
    }
    private String getSignature(String s)
    {
        int[] signature = new int[26];
        for(char c:s.toCharArray())
            signature[c -'a']++;
        return Arrays.toString(signature);
    }
}