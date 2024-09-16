//Time Complexity: O(mn) n- size of input m-size of strings.
//SPace Complexity : O(n)
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] counter = new int[26]; //Because all inputs are lowercase
            char[] temp= strs[i].toCharArray();
            for(int j=0;j<temp.length;j++){
                counter[temp[j] - 'a']++; //ASCII value of letters in each string will increase 
            }
            String mapKey = Arrays.toString(counter); //Convert the counter array into a string and use it as keys of hashmap 
            if(!map.containsKey(mapKey)){
                map.put(mapKey,new ArrayList());
            }
            map.get(mapKey).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}

