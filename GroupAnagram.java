/**
 * Time complexity: O(N * K) where N is length of the input string and K is average length of string in pattern
 * Space complexity : O(N) where N is length of the input string
 */

import java.util.*;
public class GroupAnagram{
    public static void main(String arg[]){
        //Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = getGroupAnagram(strs);

        for(List<String> r : res){
            for(String s : r){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static List<List<String>> getGroupAnagram(String[] strs){
        if(strs == null || strs.length == 0){
            return null;
        }

        Map<Double, List<String>> map = new HashMap<>();
        
        for(String st : strs){
            double key = calculateKey(st);
            List<String> tempValue = null;
            if(map.containsKey(key)){
                tempValue = map.get(key);
                tempValue.add(st);
            }else{
                tempValue = new ArrayList<>();
                tempValue.add(st);
            }
            map.put(key, tempValue);
        }

        return new ArrayList<>(map.values());
    }

    private static double calculateKey(String s){
        double key = 0;
        int [] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};

        for(char c : s.toCharArray()){
            key += primes[c - 'a'];
        }

        return key;
    }
}