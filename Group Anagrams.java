#time complexity O(NKlogK)
#Space Complexity O(NK)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
       HashMap<String, List<String>> map = new HashMap<>();
        
        for( String str:strs)
        {
            char [] charArr=str.toCharArray();
            Arrays.sort(charArr);
            String key=new String(charArr);
            if(map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else
            {
                List<String> newList=new ArrayList<>();
                newList.add(str);
                map.put(key,newList);
            }
        }
        
        result.addAll(map.values());
            return result;
    }
}