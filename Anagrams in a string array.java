//Time complexity: O(NKlogK)
//Space complexity: O(NK)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> res=new HashMap<String,List>();
        for(String s: strs)
        {
            char[] ca= s.toCharArray();
            Arrays.sort(ca);
            String key= String.valueOf(ca);
            if(!res.containsKey(key))
                res.put(key, new ArrayList());
            res.get(key).add(s);
                
        }
        return new ArrayList(res.values());
    }
}