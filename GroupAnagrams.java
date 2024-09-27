//Time complexity = O(nklogk) n -> number of words, k -> length of word
//Space complexity = O(nk)
/*Approach
*Traverse through each word, if occurring for first time storing in a map with empty list
*sorted form of words will match if they are anagrams so sort each word and check
* if their sorted form is already in the map include in that corresponding list else create new one
* at last returning all the values which are
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams{
    public static List<List<String>> groupAnagrams(String[] words){
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String word:words){
            char[]  characters = word.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(word);
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String args[]){
        List<List<String>> result = groupAnagrams(new String[]{"eat", "tea", "tan","tab", "ate", "nat", "bat","atn"});
        System.out.println(result);
    }
}