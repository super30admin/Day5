
// Time Complexity: 
// Space complexity: O(NM) N = len of strs, M = Max len of string in strs
// Code worked in Leetcode
//Any problems while coding it?: Time complexity. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] sortword = strs[i].toCharArray(); // turn word into char array and sort it
            Arrays.sort(sortword);
            String word = String.valueOf(sortword);
            // if sorted word isn't in hmap, then add it
            if(!hmap.containsKey(word)) { 
                hmap.put(word, new ArrayList<>());
            }
            hmap.get(word).add(strs[i]); //Always add word to they keys corresponding value
        }
        return new ArrayList<>(hmap.values());
    }
}