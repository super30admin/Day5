import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Time complexity is O(n k log k)
 * Space complexity is O(nk)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class GroupAnagramsUsingHashMap {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        result.stream().forEach(strings -> System.out.println(strings));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        /*Base case*/
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        /*This HashMap stores sorted String from input array as key
        * And the value List in the HashMap contains all the Strings from the input
        * array whose sorted value is the same as the key*/
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){ //Iterating over all the Strings gives O(n) complexity
            char[] cArray = s.toCharArray(); //convert String to char array
            Arrays.sort(cArray);//sort char array O(k log k) complexity
            //covert sorted char array to String, which gives sorted String
            String sorted = String.valueOf(cArray);

            /*If map doesn't contain the sorted key, then we add that key and empty list as value*/
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            /*In the value list associated with the sorted key,
            we add the input String*/
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
