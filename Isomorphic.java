// ## Problem:
// Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

// Example 1:
// Input: s = "egg", t = "add"
// Output: true

// Example 2:
// Input: s = "foo", t = "bar"
// Output: false

// Example 3:
// Input: s = "paper", t = "title"
// Output: true
// Note:
// You may assume both s and t have the same length.
// Problem Name: 205. Isomorphic Strings
// Leetcode problem Number : https://leetcode.com/problems/isomorphic-strings/
// Solution:
// Time Complexity : O(n)
// Space Complexity : O(1) As we will be storing an fix set of elements a-z, A-Z or special characters. So even if the input increases the space will be the smae so constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Description: This question can be solved using 4 ways
// 1. Using 1 hashmap : here we need to store the keys using some prefix else it will not work
// 2. Using 2 hashhmaps
// 3. Using 1 hashmap and 1 hashset : In this we will normally store in hashmap and in hashset we will just store the values
// 4. Using 2 char arrays 
// All this abpove mentioned ways will have same Time Complexity O(n) and Space Complexity O(1) 
// The space complexity is constant because in our Data Structure we will store just limited characters like a-z, A-Z or Special Characters regardless of input size of a string

//Using 2 HashMaps
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Base condition check
        // If both the strings length is not equal then they will not be isomorphic
        if((s.length()!=t.length()) || (s==null || s.length()==0)){
            return false;
        }
        //Declared 2 hashmaps
        HashMap<Character,Character> smap=new HashMap<>();
        HashMap<Character,Character> tmap=new HashMap<>();
        //loop to iterate over each character of a string
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            //We will check if the smap contains key if so then we will compare it's value with  b if not equal then we can conclude that they are not isomorphic 
            if(smap.containsKey(a)){    
                if(smap.get(a)!=b){
                    return false;
                }
            }else{                //If that key doesn't exists in smap then we will insert it in smap;
                smap.put(a,b);
            }
            // for tmap also we will check same 
            if(tmap.containsKey(b)){
                if(tmap.get(b)!=a){
                    return false;
                }
            }
            else{
                tmap.put(b,a);
            }
        }
        //If everything is good that means the strings are isomorphic and we will return true
        return true;
    }
}


//Using an array
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Base condition check
        // If both the strings length is not equal then they will not be isomorphic
        if((s.length()!=t.length()) || (s==null || s.length()==0)){
            return false;
        }
        //Declared two character arrays of size 256 
        char[] sarr=new char[256];
        char[] tarr=new char[256];
    //loop to iterate over each character of a string
        for (int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            //We will first check if at that position there is a default value or any other value 
            //For default value we can check it with 0 or /n000 (null) as 0 is the ascii value of null
            //if it doesnot have default value then we will compare it's value with b if it's not equal then the strings are not isomorphic
            if(sarr[a]!=0){
                if(sarr[a]!=b){
                    return false;
                }
            }
            //If it doesn't exists then we will asign b at sarr[a]
            else{
                sarr[a]=b;
            }
            //Same steps we will perform for tarr array
            if(tarr[b]!=0){
                if(tarr[b]!=a){
                    return false;
                }
            }
            else{
                tarr[b]=a;
            }
        }   
        //If everything is good that means the strings are isomorphic and we will return true
        return true;
        
    }
}