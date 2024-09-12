import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(nk)- since we have to iterate through the array and through string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//we are solving this by using prime multiplication
//map each character to a primenumber and then multiply that for a string
//since product of prime numbers will be unique, the combination of character can be identified
//if we get the prime product of all the strings in array, then we can group them easily
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs== null || strs.length==0) 
            return new ArrayList<>(); //return empty arraylist
        //since int has only 34bits, we use double
        HashMap<Double, List<String>> map= new HashMap<>();
        //iterate through the array
        for(int i=0; i<strs.length; i++){
            String str= strs[i];//get each string
            //call the function to find the product of primes of string
            double primeProduct= primeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
    private double primeProduct(String s){
        //initalize a prime number array
        int[] primearray={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result =1;
        //iterate through the string
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            result= result*primearray[c - 'a']; //using ASCII value
        }
        return result;
    }
}