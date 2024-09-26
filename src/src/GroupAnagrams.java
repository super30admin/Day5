import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


//TC : O(n) where n is the length of tge string array given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//The approach taken is first teh words given are sorted and hence all anagrams will give the same word back.
// The using hashmap we can group all the same words together where the original words are stored against their sorted version.
//then iterate over the hashmap and return the list of all values list.
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length; i++)
        {
            String word = strs[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);


            //if any anagram of the word is already present then just append the word to the list of values
            if(map.containsKey(newWord))
            {
                map.get(newWord).add(word);
            }

            //if not then create a new list and then and then add this to the value of lists
            else
            {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        List<List<String>> groupAnagrams = new ArrayList<>();
        for(String s: map.keySet())
        {

            List<String> values = map.get(s);
            groupAnagrams.add(values);
        }

        return groupAnagrams;
    }
}
