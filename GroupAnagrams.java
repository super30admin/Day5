// Time Complexity : All the operations are done in O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH 1: Sorting the strings
1. if sorted string is present as key in hashmap, add corresponding string.
2. Else create new entry

APPROACH 2: Creating custom hash function using prime product
1. check the key (hash value of string), if equal, add string agains key
2. else create a new entry;
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static double hashingFunction(String string){
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        for(int i=0; i<string.length(); i++){
            result = result * primes[string.charAt(i) - 'a'];
        }
        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        // APPROACH 2: Using custom hashing for strings to avoid sorting
        HashMap<Double, ArrayList<String>> hashMap = new HashMap<>();

        for(String str : strs){
            double hashValue = hashingFunction(str);
            if(!hashMap.containsKey(hashValue)){
                hashMap.put(hashValue, new ArrayList<String>());
            }
            hashMap.get(hashValue).add(str);
        }
        return new ArrayList(hashMap.values());


        // APPROACH 1: Sorting the strings
        // HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        // for(String str : strs){
        //     char[] strChar = str.toCharArray();
        //     Arrays.sort(strChar);
        //     String sorted = String.valueOf(strChar);
        //     if(!hashMap.containsKey(sorted)){
        //         hashMap.put(sorted, new ArrayList<String>());
        //     }
        //     hashMap.get(sorted).add(str);
        // }
        // return new ArrayList(hashMap.values());
    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs)); //[["bat"],["nat","tan"],["ate","eat","tea"]]

        String[] strs2 = {""};
        System.out.println(groupAnagrams(strs2)); //[[""]]

        String[] strs3 = {"a"};
        System.out.println(groupAnagrams(strs3)); //[["a"]]

    }
}
