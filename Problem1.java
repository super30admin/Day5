//T.C- O(nklogk)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> map= new HashMap<>();
        for(int i=0; i<strs.length ;i++){
            String str= strs[i];
            char[] chararray= str.toCharArray();
            Arrays.sort(chararray);
            String sorted= String.valueOf(chararray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}