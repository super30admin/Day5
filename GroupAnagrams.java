/*

Time: (O(Len(list)*Klogk))
    k = average length of strings in list of list

Space: O()

*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        HashMap<String,List<String>> sMap = new HashMap<>();
        for(String str: strs){
            // Java to sort a string
            char [] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = String.valueOf(strArr);
            
            if (! sMap.containsKey(sorted)){
                sMap.put(sorted,new ArrayList<>());
            }
            sMap.get(sorted).add(str);
            
            
        }
        return new ArrayList<>(sMap.values());
        
        
    }
}