
/*
  Time complexity - O(klogk) for sorting + O(n) for iteration ==> O(klogk)
  Space complexity -O(n)
  Leetcode - yes
  sort the string and use it as key, so all anagrams will have same key and use hashmap
*/


    class Solution {
        public static String sortString(String inputString){
          char tempArray[] = inputString.toCharArray();
          Arrays.sort(tempArray);
          return new String(tempArray);
      }
      public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> strsMap = new HashMap<String, List<String>>();
  
          for(int i=0; i<=strs.length-1; i++){
              String key = sortString(strs[i]);
              if(strsMap.containsKey(key)){
                  strsMap.get(key).add(strs[i]);
              }else{
                  ArrayList<String> temp = new ArrayList<>();
                  temp.add(strs[i]);
                  strsMap.put(key, temp);
              }
              
          }
          
          List<List<String>> anagrams = new ArrayList(strsMap.values());
      
           return anagrams;
          
      }
  }

