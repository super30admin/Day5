import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){
            String s = strs[i];
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(! hmap.containsKey(sorted)){
                hmap.put(sorted,new ArrayList<String>());
                hmap.get(sorted).add(s);
            }else{
                hmap.get(sorted).add(s);
            }

        }
        
        return new ArrayList(hmap.values());
    }
}