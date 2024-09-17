/**
 * using hash method
 * Time complexity is O(n*k) - n is number of string, k average length of string
 * space complexity is O(n) - as an array is created for each string
 * 
 * using sort method
 * Time complexity is O(n*k*logk) - n is number of string, k average length of string
 * space complexity is O(n) - in the worst case as all strings could be unique 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs) {
            String hashcode = hash(str);
            // System.out.println(hash(str));
            List<String> group = anagrams.getOrDefault(hashcode, new ArrayList<>());
            group.add(str);
            anagrams.put(hashcode, group);
        }
        return new ArrayList<>(anagrams.values());
    }
    private String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    private String hash(String str) {
        int[] arr = new int[26];
        char[] chArr =  str.toCharArray();
        for(char ch : chArr) {
            arr[ch-'a'] = arr[ch-'a'] + 1;
        }
        return Arrays.toString(arr);
    }
}
