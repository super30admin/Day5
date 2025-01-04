// ## Problem 1:
// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

// Problem Name: 49. Group Anagrams
// Leetcode problem Number : https://leetcode.com/problems/group-anagrams/
// Solution:
// Time Complexity : O(n * k(logk))
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Description : In this problem the approach will be first we will sort each string and then the sorted string will be inserted into HashMap as a key and there will be a list of values which will have a anagrams for that key.
// In this case the sorting of a single string will take o(k log(k)) and for n strings it will take O(n(k (log k))).
// Space Complexity will be O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Base Condition check
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        // Declared a hashmap
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            //We are sorting each string
            String str=strs[i];
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            //Sorted will be the sorted string
            String sorted=String.valueOf(arr);
            //If map doesn't contain a key we will initialize a list and put that key
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            //We will add a string into it's anagram list
            map.get(sorted).add(str);
        }
        // we are returning an array list of map.values(). map.values will give a list of all the values
        return new ArrayList<>(map.values());
        
    }
}

// Approach : 2
// In the previous approach we were sorting the strings were it was taking (k*log k) to sort. To make it more optimal what we can do is we can assign a prime number to each character. 
// We will directly calculate the product of each string and use it as keys to store in a hashmap
//Time Complexity = O(n*k)
//Space Complexity = O(n)
//Description: I have used double because the product can be bigger and cannot fit in the int or long
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<Double,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            double product = getPrimeProduct(strs[i]);
            String str=strs[i];
            if(!map.containsKey(product)){
                map.put(product,new ArrayList<>());
            }
            map.get(product).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
    //Function which will calculate the product of the character of a string
    private double getPrimeProduct(String str){
        int[] arr={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        char[] ch=str.toCharArray();
        double product=1;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            product=product*arr[c-'a'];
        } 
        return product;
    }
}