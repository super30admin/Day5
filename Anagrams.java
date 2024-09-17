// Time Complexity : nklog(k)
// Space Complexity :nk
// Did this code successfully run on Leetcode :y
// Any problem you faced while coding this :n


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0){
            return new ArrayList<List<String>>();
        }
        
        HashMap<String,List<String>> map = new HashMap<>(); // Declare new hashmap with String as key and List of strings as value 
        
        for(String s : strs)
        {
          char c[] = s.toCharArray(); 
          
        // sort the  character array 
          Arrays.sort(c);        
         String sorted = String.valueOf(c);
          if(!map.containsKey(sorted))  // if key is not present, then add key and create a empty list
          {
              map.put(sorted,new ArrayList<String>());
          }
           
          map.get(sorted).add(s); // if key is present, add value in the arraylist corresponding to the key
        }
        return new ArrayList<List<String>>(map.values());  // return all the values 
        
        }
        
    }
