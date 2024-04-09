import java.util.*;

/**
Sorting each string in the array 
If Sorted string is present, add the curren string to that list
return the list of the map.values()


Time complexity - O(n * klog(k) )- > k is length of each string)
Space Complexity - O(n * k)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length==0 ) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            //sort sring
            char[] sortCharArray = s.toCharArray();
            Arrays.sort(sortCharArray);
            String sortedStr = String.valueOf(sortCharArray);

            // if not present in map create list
            if(!map.containsKey(sortedStr)){
                 map.put(sortedStr,new ArrayList());
               
            }
            // add to the list using the sortedStr as key
            map.get(sortedStr).add(s);
           
        }
        return new ArrayList(map.values());
    }
}