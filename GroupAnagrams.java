import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
We create hashmap of double , list of string. We assign prime number for each character,
and calculate their product and store them as key to make key unique as product of prime numbers will always be different for 
two strings which are not anagram. We canculate each string prime product and then compare with key and store them in
approprivate value list.
*/

//Time Complexity : O(n*k) , k be the length of each String
//Space Complexity : O(n*k)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Double, List<String>> map=new HashMap<>();
        for(String s:strs){
            Double pp=primeProduct(s);
            if(!map.containsKey(pp)){
                map.put(pp,new ArrayList<String>());
            }
            map.get(pp).add(s);
        }
        return new ArrayList<>(map.values());
        
    }

    private double primeProduct(String s){
        int[] prime=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        double res=1.0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            res=res*prime[ch-'a'];

        }
        return res;
    }
}
