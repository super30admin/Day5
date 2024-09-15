package HashFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Time complexity : o(n*(k*klogk)) - n * traversing each element o(n) and sorting each word (klogk) and look up of word in map k.
space complexity: o(n*k) --> o(n*k) map + o(n*k) for words in list
Did this code run successfully in leetcode : yes
problems faces : no
traverse the given input of words. Sort each word and put the sorted word in map as key and word as value (arraylist).
While putting the sorted word , check if that sorted word already exists, if exists and add the word to arraylist which stroed as value.
*/
public class Anagram {
  public List<List<String>> groupAnagrams(String[] strs) {
      
      if(strs==null || strs.length==0) return null;
      
      HashMap<String,List<String>> map = new HashMap<>();
      
      for(int i=0;i<strs.length;i++)
      {
          String w = strs[i];
          char[] c = strs[i].toCharArray();
          Arrays.sort(c);
          String sortedWord = String.valueOf(c);
          
          if(map.containsKey(sortedWord))
          {
              map.get(sortedWord).add(w);
           
          }
          else {
              List<String> anagrams = new ArrayList<>();
              anagrams.add(w);
              map.put(sortedWord, anagrams);
              
          }
          
      }
      return  new ArrayList<>(map.values());
   }

}
