import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s:strs){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            String sorted = new String(tempArray);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }
        
        List<List<String>> list = new ArrayList<List<String>>();
        for(Map.Entry m : map.entrySet()){
            List<String> s = (List)m.getValue();
            list.add(s);
        }
        return list;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)