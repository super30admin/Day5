//Time Complexity- O(nklogk)  //Where klogk is for sorting the string and n is the no of strings
//Space Complexity- O(n)
//Successfully ran on leetcode



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


class Anagrams {
 public List<List<String>> groupAnagrams(String[] strs) {
     
     HashMap<String, List<String>> map= new HashMap<>();
     
     for(int i=0; i< strs.length; i++){
         
         String str= strs[i];
         
         char[] charArray= str.toCharArray();
         Arrays.sort(charArray);
         String sorted= String.valueOf(charArray);
         
         if(!map.containsKey(sorted)){
             map.put(sorted, new ArrayList<>());
         }
             map.get(sorted).add(str);
     }
     
     return new ArrayList<>(map.values());
     
 }
}



