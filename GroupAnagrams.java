// Time Complexity : O(N mlogm) where N is the length of pattern and
//                             m is the of individual string
//                             - mlogm is time complexity for sorting it
// Space Complexity : O(N * m) where N is the length of strings
//                   and m for length of individual string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no



import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String, List<String>> map = new HashMap<>();


        for(String s : strs){

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                map.put(key,new ArrayList<String>(Arrays.asList(s)));
            }

        }

        return new ArrayList<>(map.values());

    }
}
