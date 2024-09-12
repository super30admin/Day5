class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //sanity check
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List> map = new HashMap();
        for (int index=0; index < strs.length; index++) {
            
            // sort the string
            char[] s = strs[index].toCharArray();
            Arrays.sort(s);
            String sortedStr = String.valueOf(s);
            
            // if map doesn't contain sorted string
            // add empty list as value for this sorted string (key)
        
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // put value as this string for this sorted string
            // list of anagrams for this string
            ArrayList aList = (ArrayList)map.get(sortedStr);
            aList.add(strs[index]);
            map.put(sortedStr, aList);            
            
        }
        
        List<List<String>> result = new ArrayList(map.values());
    
        return result;
        
    }
}
