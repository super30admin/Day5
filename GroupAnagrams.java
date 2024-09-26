import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Time Complexity: O(nklogk) where n is the number of words and k is the length of each word. klogk comes because we are sorting each word.
//space complexity : O(nk) because we are storing upto a max of n sorted words with each of some k length as keys in the hashmap.
//any issues while coding this: none
//executed on leetcode : yes
//approach : 1. we wil be iterating throughout the array, store sorted values of each word as keys in the hashmap. since anagrams are words which would yield same results on sorting their characters, we see for each word, if the sort of that word is present as key in the hashmap.
//if the sort of that word is present as key, we add the word to the value of that key or in else case, we create a new key value pair in the hashmap
import java.util.*;
class GroupAnagram
{

    public static List<List<String>> findGroupAnagram(String[] input)
    {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s : input)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<String>());
                map.get(sorted).add(s);
            }
            else map.get(sorted).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }


    public static void main(String[] args)
    {
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println("group anagrams are: "+ findGroupAnagram(input)); 
    }



}