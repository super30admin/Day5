// Time Complexity : O(NMlogM) where N is length of strs and M is max length of string . O(N) for iterating over the strs and O(MlogM) for sorting
// Space Complexity :O(NM) for Hashmap created to store key anagarm and value list of all anagrams
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hmap = new HashMap<>(); // HashMap to store key sorted anagram word and value list of all words which are same anagram
        List<List<String>> result=new ArrayList<>();
         List<String> val=null;
        if(strs.length==0) return result;
        if(strs.length==1){
            result.add(Arrays.asList(strs)); // if length is 1 just return the list
            return result;
        }
        
        for(String s:strs){
            
            char ch[]=s.toCharArray(); // sort each word in string
            Arrays.sort(ch);
            String s1=String.valueOf(ch); // convert srorted word into string
            if(hmap.containsKey(s1)) // check if key is present
               val=hmap.get(s1);   // append to existing list of the given key
            else
                val=new ArrayList<String>(); // else create new arraylist and start adding this word
            
            val.add(s);
            hmap.put(s1,val); 
               
            }
            
        for(String map : hmap.keySet()){
            
            List<String> mapvalue=hmap.get(map); // retrieve all values from hashmap and copy to new list and return list of list
            result.add(mapvalue);
            
        }
            
            
            return result;
            
        }
        
}