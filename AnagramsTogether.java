//Time Complexity: O(nk logk)
//Space Complexity: O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null) return new ArrayList<>();
        HashMap<String, List<String>> map= new HashMap<>();
        for(int i=0;i<=strs.length-1;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            if(!map.containsKey(sorted)){
              map.put(sorted, new ArrayList<>());  
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}