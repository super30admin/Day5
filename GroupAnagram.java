package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for(String s : strs){
                char[] ch = new char[26];
                for(char ca : s.toCharArray()){
                    ch[ca - 'a']++;
                }
                String keyStr = String.valueOf(ch);
                if(!map.containsKey(keyStr)){
                    map.put(keyStr,new ArrayList<>());
                }
                map.get(keyStr).add(s);
            }
            return new ArrayList<>(map.values());
        }
}
