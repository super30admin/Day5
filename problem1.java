//Problem 1:
//Given an array of strings, group anagrams together.
//
//        Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
//
//Note: All inputs will be in lowercase. The order of your output does not matter.

//Time complexity: O(n*k)
//Space complexity: O(n*k)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class problem1 {

    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<Double, List<String>> map= new HashMap<>();

        for (String word: strs)
        {
            double hash= getHash(word);
            if (!map.containsKey(hash))
            {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(word);
        }
        return new ArrayList<>(map.values());
    }
    private double getHash(String word)
    {
        double hash=1;
        int[] prime= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,61,67,71,73,79,83,89,97,100};
        for (char c: word.toCharArray())
        {
            hash = hash * prime[c - 'a'];
        }
        return hash;
    }

    public static void main(String[] args)
    {

    }
}
