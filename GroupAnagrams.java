import java.util.*;

public class GroupAnagrams {

    /*
        Given an array of strings, group anagrams together.
        TC :O(n * m * log(m)) where n is the length of arr and m is the maximum length of string in arr
        SC : O(n) where n is the length of array(hashmap), Not considering the output list in space complexity.
    */

    public List<List<String>> GetGroupedAnagrams(String arr[]){
      if(arr==null || arr.length==0){
          return new ArrayList<>();
      }
      List<List<String>> result=new ArrayList<>();
      HashMap<String,List<String>> map=new HashMap<>();

      for(int i=0;i<arr.length;i++){

          char word[]=arr[i].toCharArray();
          Arrays.sort(word);
          String sortedWord=String.valueOf(word);

          List<String> anagrams;
          if(map.containsKey(sortedWord)){
              anagrams=map.get(sortedWord);
          }
          else{
              anagrams=new ArrayList<>();
          }
          anagrams.add(arr[i]);
          map.put(sortedWord,anagrams);
      }

      for(Map.Entry<String,List<String>> entry:map.entrySet()){
          result.add(entry.getValue());
      }
      return result;
    }

    public static void main(String args[]){
      String arr[]=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
      GroupAnagrams ga=new GroupAnagrams();
      List<List<String>> res= ga.GetGroupedAnagrams(arr);
      for(List<String> s:res){
          for(String st:s){
              System.out.print(st+ " ");
          }
          System.out.println();
      }
    }
}
