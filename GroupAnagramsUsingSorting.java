import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    /*
    Time Complexity: O(n * k log k) where n is the length of the array and k is the length of each and every character

    This involves 2 steps:

    1. Sorting each string
    For each string, we convert it to a character array and then sort it. If the length of a string is k, sorting that string takes O(k log k) time.
    Since we perform this sorting operation for every string in the input, and there are n strings, this results in a time complexity of: O(n⋅klogk)
    where n is the number of strings and k is the length of the longest string.

    2. Storing the sorted string in the map
    After sorting each string, we convert it back to a string and use it as a key in the map. Checking for the key in the map and adding the original
     string to the corresponding list inside the map takes constant time on average — i.e., O(1) for each string.

    This operation is done for every string in the array, so it takes O(n) time in total for all strings.

    Combined Complexity:
    Sorting each string takes O(k log k) for each string.
    Checking and adding the sorted string to the map takes O(1) for each string, which across n strings contributes O(n).
    Thus, the total time complexity is the sum of these two:

    O(n⋅klogk)+O(n⋅k)

    Now, why is the term O(n * k) needed?

    O(n * k) represents the work done in converting each string to a character array and performing the String.valueOf(temp)
    operation (which is O(k) for each string).

    The sorting step dominates the overall complexity, so the total complexity simplifies to: (n⋅klogk)

    But technically, if we break it down step-by-step, the complexity is O(n * k log k) + O(n * k), but the O(n * k log k) term
    will dominate for large n and k.


Space Complexity: O(1) it is constant as 26 characters
 */

class GroupAnagramsUsingSorting {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] temp = word.toCharArray();
            Arrays.sort(temp);

            String sortedString = String.valueOf(temp);

            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(word);
        }

        return new ArrayList<>(map.values());
    }
}