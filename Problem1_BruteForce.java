//PROBLEM - group Anagrams
/** 3 Pointer Approcach: 
 * Sort each word and add as key and corresponding unsorted value 
 */ 
//
//time Complexity :
// O (N K logK),  => N is number of Strings and K is length of word with max length 

// Space Complexity :
//  O(N K) 

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

class Problem1UsingBruteForce {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        //HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){ //N 
            
           char[] arr = s.toCharArray(); //  K Log K {K : max length in strings}
           Arrays.sort(arr);
           String val = String.valueOf(arr);
            
           if(!map.containsKey(val)){
               map.put(val, new ArrayList<String>());
           }  
            
            map.get(val).add(s);
        
        }
        
        return new ArrayList(map.values());
        
    }
}
