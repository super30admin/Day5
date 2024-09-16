/**
 * 49. Group Anagrams
 * Time Complexity: O(NK) where N is the length of the input String array and K is the longest length of the each string array
 * Space Complexity: O(NK)
 *
 * Leetcode submission : yes
 */
import java.util.*;

/**
 * Each string is converted to a string counting the no of letters(using 26 char array) in it and that is the key.
 * Whenever similar keys are found, its put with the same key using hashmap and returned the values of the hashmap
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length == 0)
            return new ArrayList();

        Map<String,List<String>> hmap = new HashMap<String, List<String>>();

        for(int i=0;i<strs.length;i++){

            char[] chararray = new char[26];                    //char array of 26 letters
            Arrays.fill(chararray,'0');                     //all chars are init. filled with 0
            for(char c: strs[i].toCharArray()){
                chararray[c-'a']++;                            // the letter in the chararray is increased.
            }

            if(!hmap.containsKey(String.valueOf(chararray)))
                hmap.put(String.valueOf(chararray),new ArrayList<String>());    //new key and a list is added
            hmap.get(String.valueOf(chararray)).add(strs[i]);
        }
        return new ArrayList(hmap.values());
    }
}
