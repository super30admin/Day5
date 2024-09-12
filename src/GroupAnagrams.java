// Approach:            Approach 1      Approach 2      Approach 3
// Time Complexity:       O(n*k)          O(n*k)       O(n*k*log(k))
// Space Complexity:       O(n)           O(n*k)           O(n)
// where n is length of given string array, k is length of the longest string among them
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

import java.util.*;

public class GroupAnagrams
{
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"} ;
        FindAnagrams fa = new FindAnagrams() ;
        List<List<String>> finalAns = fa.groupAnagrams(strs);
        for(List l : finalAns){
            System.out.println(l);
        }
    }
}

class FindAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs) {


// ################################################## APPROACH 01 ##################################################
        Map<Double, List<String>> map = new HashMap<>();
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};       // Creating array of prime numbers
        for(String s : strs)                                                                               // Fetching Strings one by one
        {
            double ans = 1;
            for(int i=0; i<s.length(); i++)                                                                // Fetching Characters one by one
            {
                char c = s.charAt(i);
                ans *= prime[c - 'a'];                                                                     // Updating variable "ans" to get unique hash key
            }
            List<String> list = map.computeIfAbsent(ans, key -> new ArrayList<String>());                  // If key absent then create key having value as empty arraylist
            list.add(s);                                                                                   // Adding string in list of strings stored as a value
//            if(!map.containsKey(ans))
//                map.put(ans,new ArrayList<>());
//            map.get(ans).add(s);
        }
        return new ArrayList<List<String>>(map.values());                                                  // returning values stored in value part of hashmap



// ################################################## APPROACH 02 ##################################################
//        Map<Map, List<String>> map = new HashMap<>();
//        for(String str : strs)
//        {
//            Map<Character, Integer> innerMap = new HashMap<>();
//
//            for(int i=0; i<str.length(); i++){
//                char ch = str.charAt(i);
//                innerMap.put(ch, innerMap.getOrDefault(ch, 0) + 1);
//            }
//
////            char[] chararr = str.toCharArray();
////            for(int i=0; i<chararr.length; i++)
////            {
////                if(innerMap.containsKey(chararr[i]))
////                {
////                    int temp = innerMap.get(chararr[i]);
////                    innerMap.put(chararr[i],temp+1);
////                }
////                else
////                    innerMap.put(chararr[i],0);
////            }
//            if(!map.containsKey(innerMap))
//                map.put(innerMap, new ArrayList<>());
//            map.get(innerMap).add(str);
//        }
//        return new ArrayList<>(map.values()) ;


// ################################################## APPROACH 03 ##################################################
//        Map<String, List<String>> map = new HashMap<>();
//
//        for(String str : strs)
//        {
//            char[] charArr = str.toCharArray();
//            Arrays.sort(charArr);
//            String temp = String.valueOf(charArr);
//
//            if(!map.containsKey(temp))
//                map.put(temp,new ArrayList<>());
//            map.get(temp).add(str);
//        }
//        return new ArrayList<>(map.values());

    }
}