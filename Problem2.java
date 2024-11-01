// Time Complexity :isIsomorphic: O(2n)=O(n) , n is  number of characters in the string
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String str : strs){
            double hash = getHash(str);
            if(!map.containsKey(hash)){
                map.put(hash,new ArrayList<>());
            }
                map.get(hash).add(str);

        }

        return new ArrayList<>(map.values());
    }

    private double getHash(String str){
        int hash = 1;
        int[] prime ={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for( char c : str.toCharArray()){
            hash = hash * prime[c-'a'];
        }
        return hash;
    }

    public static void main(String args[]) {
            Problem2 problem2= new Problem2();
        String[] s= {"eat","tea","tan","ate","nat","bat"};
        System.out.println("grouped anagram is "+problem2.groupAnagrams(s));

    }
}
