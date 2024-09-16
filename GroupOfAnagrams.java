import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
Time Complexity: O(n*klog(k)))
Space Complexity: O(n)
Code run on Leetcode: Yes
Any difficulties: no

Approach:
1. We are given an array of strings, and anagram is string that is formed by rearranging the letters of the string
2. I am using HashMap to save all the values which are anagram to the given string, to that I am gonna sort the string
so that all my letters will be ordered alphabetically
3. Then I would look if the key i.e. alphabetically sorted key is present in the hashmap or not, if that is not present I am gonna
add a new array in the list otherwise I would add the string in the Map's value
4. At last I would return the entire Values of the HashMap
 */
public class GroupOfAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String key = String.valueOf(cArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        for(int i = 0; i<result.size(); i++){
            for(int j =0; j<result.get(i).size(); j++) {
                System.out.println("Print groups: " + result.get(i).get(j));
            }
        }
    }
}
