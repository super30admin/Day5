# Time Complexity : O(n(log(n)))
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :  problem in converting list of character to list of string(collection list to list of list of string)



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       //hashmap (string,list) -- 1 n
      //for each string in orig array sort it and store in temp key and check if the key already exist in hashmap
    
        //if key matches append the cooresponding value in orig array 1
        //else next string put in new key 1
        //return list of string 1,n
        //e
//          Map<String,List<String>>map1 = new HashMap<>();
//         for(String str : strs)
//         {  char[] ch= str.toCharArray();
//             String temp_key = new String(ch);
//          if(map1.get(temp_key)== null)
//          {
//             map1.put(temp_key,new ArrayList<String>());
            
//          } map1.get(temp_key).add(str);
//         }
//          return new ArrayList(map1.values()); 
            
        
//     }}
        Map<String,List<String>> map1 = new HashMap<>();
        for(String str : strs)
            
        {  
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            // String s= String(ch);
           String temp_key= new String(ch);
           System.out.println(temp_key);
//             String temp_key = str.sort();
            // System.out.println(ch);
        if(map1.get(temp_key) == null)
            {
                map1.put(temp_key,new ArrayList<String>());// append
                
                
            } 
            
            map1.get(temp_key).add(str);
            
                
    }
        //System.out.println( map1.values());
         
           return new ArrayList(map1.values()); 
            
    }}

         