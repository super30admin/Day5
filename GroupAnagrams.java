// Time Complexity : O(N * L) where N is the length of the array of prime numbers and 
// L is average length of a string in the input.
// Space Complexity :O(N * L)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1 Consider a prime number array with the first 26 prime numbers.
//2 Using a Map find product of the charaters in each string.
//3 Map the product with the corresponding string with same product value;

import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            long prod=findProd(s);
            
            if(!map.containsKey(prod)){
                map.put(prod,new ArrayList<>());
            }
            map.get(prod).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
        
        
        
        private long findProd(String str){
            int []primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,
                          79,83,89,97,101,103};
            long prod = 1;
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                prod = prod * primes[c-'a'];
            }
            return prod;
            
            
            
        
        
    }
    public static void main(String args[]){

        GroupAnagrams obj=new GroupAnagrams();
        String []arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        
        System.out.println(obj.groupAnagrams(arr));
    }
}