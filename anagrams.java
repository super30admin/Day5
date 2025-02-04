//anagrams solution
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedValue= String.valueOf(arr);
            if(!map.containsKey(sortedValue)){
                map.put(sortedValue,new ArrayList<String>());
                map.get(sortedValue).add(strs[i]);
            }else{
                map.get(sortedValue).add(strs[i]);

            }
        }
        return new ArrayList<>(map.values());
    }
}
