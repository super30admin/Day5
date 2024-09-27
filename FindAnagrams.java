// Time Complexity : O(nl(log(l)), where l is the length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing1;

import java.util.*;

public class FindAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        //check for null
        if (strs.length == 0 || strs == null) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
// Time complexity: O(nl), space complexity : O(n), using prime product
//    public List<List<String>> groupAnagrams(String[] strs) {
//        //check for null
//        if(strs.length == 0 || strs == null) return new ArrayList<>();
//        HashMap<Long, List<String>> map = new HashMap<>();
//        for(String str : strs){
//            //char [] ch = str.toCharArray();
//            //Arrays.sort(ch);
//            //String sorted = String.valueOf(ch);
//            long primeProduct = primeProduct(str);
//                if(!map.containsKey(primeProduct)){
//                map.put(primeProduct, new ArrayList<>());
//            }
//            map.get(primeProduct).add(str);
//        }
//        return new ArrayList<>(map.values());
//    }
//    
//    private long primeProduct(String s){
//        int [] primeChar = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
//        long res = 1;
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            res = res * primeChar[c - 'a'];
//        }
//        return res;
//    }
