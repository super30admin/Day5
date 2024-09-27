// Time Complexity : O(nklog(k)) + O(n), where n=length of the list of strings and k=average size of each string
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach        

class Solution {
  
     public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return new ArrayList<>();           //if empty list then create empty array list
        HashMap<Double, List<String>> map = new HashMap<>(); //Sorted String and list of anagrams associated with it
        
        //Traverse through the list and find primeProduct
        for(int i=0; i<strs.length; i++){
            
            double primeProduct = calculateProduct(strs[i]);
            
            if(!map.containsKey(primeProduct)){              //check whether hashmap contains primeProduct key
                map.put(primeProduct, new ArrayList<>());    //if it doesn't contain the primeProduct key, then create one
            }
            map.get(primeProduct).add(strs[i]);              //if it contains primeProduct key, then add the string to this list 
        }
        
        return new ArrayList<>(map.values());
    }
    
    private double calculateProduct(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        double result = 1;
        for(int i=0; i < s.length(); i++){
                char c = s.charAt(i);
                 result = result * primes[c - 'a']; //Based on ASCII Values
        }
        return result;
    }
    
}