/*
[In this we are given a list of strings and we have two find if they are anagrams.
An angram is a n words when sorted gives same string.
For example ate and eat when sorted will give us "aet"]
Approach1: Take a string sort it and store it in hashmap as key and store the original string as value.
Eg
{"aet": ["eat","tea","ate"]
"ant": ["tan","nat"]
"abt": ["bat"]}
*/
// Time Complexity : nklogk + k -> O(nklogk).. ignore k as it's dominated by nklogk [k is average length of word][klogk with best sorting algorithms][need to be done n times] + [search k times]
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Approach with sorting
        if(strs==null || strs.length == 0) return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());    
        }
    }

/*
Approach 2:Using product of unique prime numbers
Give each letter an unique prime number and multiply them as they are encountered in string and store the product as a key in hashmap and value will be the original string. 
Continue this and multiply to get a key. If key is unique store into hashmap. Else, update the value array and add new string with the original string.

Tc-> O(nk)// as we don't need to sort it again.
*/
// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Approach with sorting
        if(strs==null || strs.length == 0) return new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str:strs){
            double pproduct = primeProduct(str); 
            if(!map.containsKey(pproduct)){
                map.put(pproduct,new ArrayList<>());
            }
            map.get(pproduct).add(str);
        }
        return new ArrayList<>(map.values());    
        }
    private double primeProduct(String s){
        double result =1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            result = result * primes[c -'a'];
        }
        return result;
    }
}