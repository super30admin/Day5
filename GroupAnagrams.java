import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * TC: O(nk) where n is size of strs, string array,and k is average length of string in strs
 * SC: O(n) to store hashmap of anagram list, n is total number of strings in strs array
 */

public class GroupAnagrams {

        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,27,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<Double, List<String>> hashAnagramsMap = new HashMap();

            for(String anagram: strs) {
                double hash = calculateHash(anagram);

                hashAnagramsMap.computeIfAbsent(hash, k -> new ArrayList<String>()).add(anagram);
            }

            return new ArrayList<>(hashAnagramsMap.values());
        }

        private Double calculateHash(String anagram) {
            double hash = 1;
            for (int i=0; i < anagram.length(); i++) {
                hash *= prime[anagram.charAt(i) - 97];
            }
            return hash;
        }
}
