// Time Complexity : O(nklog(k)) + O(n), where n=length of the list of strings and k=average size of each string
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//1st approach (Sorting each string in list)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return new ArrayList<>();           //if empty list then create empty array list
        HashMap<String, List<String>> map = new HashMap<>(); //Sorted String and list of anagrams associated with it
        
        //Traverse through the list and sort each string by converting it to character array
        for(int i=0; i<strs.length; i++){
            char [] charArr = strs[i].toCharArray();    //coverting into character array
            Arrays.sort(charArr);                       //sorting the string
            String sorted = String.valueOf(charArr);    //converting back into string 
            
            if(!map.containsKey(sorted)){              //check whether hashmap contains sorted string key
                map.put(sorted, new ArrayList<>());    //if it doesn't contain the sorted string key, then create one
            }
            map.get(sorted).add(strs[i]);              //if it contains sorted string key, then add the string to this list 
        }
        
        return new ArrayList<>(map.values());
    }
}


//2nd Approach (Prime Product / Form Factor method)

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