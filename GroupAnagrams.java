//Group Anagrams
// Time Complexity : O(N.K)-where N is size of the array and K is the length of each element of array 
// Space Complexity : O(N.K)-because there will be N elements of K length
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
   -- Brute force approach will be traverse for each element in the array for finding the similar element which will be O(n^2)
   -- Optimal 1-> Sort each element and save it as key and save unsorted as value.This will be O(N.klogk)
   -- Optimal  2-> Use the concept of hashing, create hash of each element using Prime product which will give a unique result and then store that hash in map as key and value as string  
*/
import java.util.*;

class Solution12 {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0){
            return null;
        }
        
        Map<Long,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            long hash = getPrimeProduct(strs[i]);
            
            List<String> list = map.get(hash);
            
            if(list==null){
                list = new ArrayList<>();
            }
            
            list.add(strs[i]);
            map.put(hash,list);
        }
        
        
        return new ArrayList<>(map.values());
    }
    
    //Finding hash
    private long getPrimeProduct(String str){
        
        int[] prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73, 79,83,89,97,101};//because there will be only 26 lowercase characters
        
        long res = 1;
        
        for(int i=0;i<str.length();i++){
             res = res * prime[str.charAt(i)-'a'];
            
        }
          
       return res;  
    }
}