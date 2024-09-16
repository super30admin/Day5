import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class Anagrams {

     List<List<String>> getAnangram(String[] nums){
    List < List<String>> out = new ArrayList();
    HashMap<Double, List<String>> map = new HashMap<>();

   for(String ipString : nums){
       double sortedKey = this.getHash(ipString);
       if(!map.containsKey(sortedKey)){
           map.put(sortedKey, new ArrayList<>());
       }
       map.get(sortedKey).add(ipString);
   }

    for (List<String> list : map.values()){
        out.add(list);
    }
        return out;
    }

    int[] primes = {2,3,5,7,11,13,17,19,23,29,
                    31,37,41,43,47,53,59,61,67,71,
                    73,79,83,89,97,101,103};

    double getHash(String ipString){
        char [] ch = ipString.toCharArray();
        double hash = 1;
        for (char c : ch){
            hash = hash * primes[(int)c - (int)('a')];
        }
        return hash;
    }



    public static void main(String[] args){

        String[] nums =  { "eat","tea","tan","ate","nat","bat"};
        Anagrams obj = new Anagrams();
        System.out.println(obj.getAnangram(nums));
    }
}
