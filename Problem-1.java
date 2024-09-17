import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    //aNagram
    // here we take Hashmap where key is sorted string .
    // now as we take each string from string array ...it is first sorted then check inthe map if its present then its added to the list of strings or if not then create new arraylist.
    //Time Complexity : O(n) Space Complexity :O(n)
    public List<List<String>> groupAnagrams(String[] strs) {    
        Map<String , List<String>> hm = new HashMap<String , List<String>>();
        for(int i =0; i < strs.length ; i++){
            char []arr = strs[i].toCharArray(); 
            Arrays.sort(arr); 
            String s1 = String.valueOf(arr);
           if(hm.containsKey(s1)){
               hm.get(s1).add(strs[i]);
           }else{
               hm.put(s1,new ArrayList<String>());
            hm.get(s1).add(strs[i]);
           }
        }
       List<List<String>> l1 = new ArrayList<List<String>>();
     
         for (Map.Entry<String, List<String>> mapElement : hm.entrySet()) { 
          
             l1.add( mapElement.getValue());
         }
     
        return l1;
    }
}