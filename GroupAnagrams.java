// Time Complexity : There are two nested for loops: First for loop runs on String array and inner for loop runs on length of each string of the array to calculate product. So Asymtotic Time Complexity = O(nk), where n is length of string array and k is length of each string
// Space Complexity : O(n) - If hashmap has all unique products as keys for all n elements in the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach

import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>(); //edge case if string array is empty
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String s: strs)
        { //iterating over all strings
            long prod = findprod(s);   
            if(!map.containsKey(prod))
            {   //if product is not present as a key in the hashmap, add the product as a key and initialize an empty arraylist corresponding to it
                map.put(prod, new ArrayList<>());
            }
            map.get(prod).add(s);  //add the string to its respective product in the hashmap
        }
        return new ArrayList<>(map.values());
    }
    private long findprod(String s)
    { //find prime product of each string in the string array
        long result = 1;
        int [] prime_nos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};  //first 26 prime numbers since no. of alphabets are 26
       for(int i =0; i < s.length(); i++)
       {
           char c = s.charAt(i);
           result = result * prime_nos[c - 'a']; 
       }
        return result;
    }

}

// Class with main function
class Main
{
    public static void main(String[] args)
    {
    GroupAnagrams obj = new GroupAnagrams();
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result = new ArrayList<>();
    result = obj.groupAnagrams(input);
    int i = 1;
    for(List<String> l : result)
    {
        System.out.println("\nSet " + i + " Anagrams are: ");
        i++;
        for(String s: l)
        {
            System.out.println(s + " ");
        }

    }
    }
}