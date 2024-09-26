package com.hashing1;

// Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.*;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> groupedAnagrams = new ArrayList<>() ;
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            String sortedString = new String(chars);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }


        groupedAnagrams.addAll(map.values());


        return groupedAnagrams;

    }


    public static void main(String[] args) {
        GroupAnagrams sol = new GroupAnagrams ();

        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};

        System.out.println (sol.groupAnagrams (strs));


    }
}
