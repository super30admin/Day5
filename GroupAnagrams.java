// Time Complexity : O(nk) where n is number of strings and k is avg length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


package Hashing1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    /* prime product gives a unique number for every string which is better than sorting as it changes complexity to n.k log k
    Find prime product of a string and any other string with same key will be grouped togther
    these groups are returned
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs==null||strs.length==0){
            return result;
        }
        HashMap<Double, List<String>> groups = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            double hashKey=primeProduct(strs[i]);
            List<String> anagramGroups;
            if(groups.containsKey(hashKey)){
                anagramGroups = groups.get(hashKey);
                anagramGroups.add(strs[i]);
            } else {
                anagramGroups = new ArrayList<>();
                anagramGroups.add(strs[i]);
                groups.put(hashKey, anagramGroups);
            }
        }
        return new ArrayList<>(groups.values());
    }
    private double primeProduct(String str){
        int [] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double primeProduct=1;
        for(int i=0;i<str.length();i++){
            int charIndex=str.charAt(i)-'a';
            primeProduct*=prime[charIndex];
        }
        return primeProduct;
    }

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }
}