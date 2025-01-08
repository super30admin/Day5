/*sort each string, store the sorted string as key in HashMap.
add it's corresponding unsorted string as a value in form of ArrayList to the sorted string.
return the array lists in HashMap.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s: strs)
        {
            String word = s;

            //convert String to char, sort, and convert back to Array
            char[] c = word.toCharArray();
            Arrays.sort(c); //sorting every string.
            String sortedWord = new String(c);

             /*check if the sorted word exists in map, if not add the sorted word,
             and create a new ArrayList as value, where you are storing all
             corresponding words that have the same sorted letters*/
            if(!mp.containsKey(sortedWord))
            {
                mp.put(sortedWord, new ArrayList<>());
            }

            //add values to ArrayList that was initialized above
            mp.get(sortedWord).add(word);


        }
        return new ArrayList<>(mp.values());
    }

   /* public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }*/
}
