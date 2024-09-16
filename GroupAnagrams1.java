import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> res = new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<String>());
            }
            map.get(sortedString).add(strs[i]);
                //map.put(sortedString,Arrays.asList(strs[i]));
            //  if(map.containsKey(sortedString)){
            //     map.get(sortedString).add(strs[i]);
            // }else{
            //     map.put(sortedString,Arrays.asList(strs[i]));
            //  }     
        }
        for(List<String> list: map.values()){
            res.add(list);
        }
               return res;
    }
}