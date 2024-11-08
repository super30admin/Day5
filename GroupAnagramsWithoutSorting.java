import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Time Complexity: O(n*k) where n is the length of the array and k is the length of each and every character
                eg: ['bat', 'tab'] n = 2 and k for bat is 3 and for tab is 3

Space Complexity: O(1) it is constant as 26 characters

Using prime numbers for hashing is a technique to reduce hash collisions. Since prime numbers are not divisible by any other number
except 1 and themselves, they help ensure that different combinations of characters (e.g., different words) lead to different hash
values with a lower chance of a collision.
 */
class GroupAnagramsWithoutSorting {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String word : strs)
        {
            double hash = getHash(word);

            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(word);
        }

        return new ArrayList<>(map.values());
    }

    private double getHash(String word)
    {
        double hash = 1;
        int[] prime ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(char c: word.toCharArray())
        {
            //We will be having 26 characters, c is the incoming character, c-'a' will take us to corresponding index in prime array
            hash = hash * prime[c-'a'];
        }

        return hash;
    }
}