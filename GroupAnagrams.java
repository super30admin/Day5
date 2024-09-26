//Time complexity : O(NKlogK)
//Space complexity : O(1)
//Did this code run on leetcode : yes
//Did you face any problem : no
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String s: strs){
            //sort the given strings
            char[] splitArr = s.toCharArray();
            Arrays.sort(splitArr);
            String sorted = String.valueOf(splitArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
                
        }
        return new ArrayList<>(map.values());
        
    }
}