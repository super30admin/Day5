// ## Problem 2:
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

// Time complexity: O(n)
// Space complexity : O(1)


// 2 hash map approach
//search key in both maps

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
    if( s.size() != t.size()){
        return false;
    }
        
    unordered_map<char, char> st_map;
    unordered_map<char, char> ts_map;
        
    for(int i =0 ;i <s.size(); i++){
        
        if(st_map.find(s[i])!=st_map.end()){
            
            char mapping= st_map[s[i]];
            if( mapping != t[i]){
                return false;
            }
            
        }
        else{
            
            st_map[s[i]] =t[i];
        }
        
        if(ts_map.find(t[i])!=ts_map.end()){
            
            char mapping= ts_map[t[i]];
            if( mapping != s[i]){
                return false;
            }
            
        }
        else{
            
            ts_map[t[i]] =s[i];
        }
    }
        
    return true;
        
    }
};


// 1 hash map approach
//search key and value in map
// limitation -> seach value is O(n) in hashmap

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
    if( s.size() != t.size()){
        return false;
    }
        
    unordered_map<char, char> st_map;
    unordered_map<char,char> ::const_iterator it;
        
    for(int i =0 ;i <s.size(); i++){
        
        if(st_map.find(s[i])!=st_map.end()){
            
            char mapping= st_map[s[i]];
            if( mapping != t[i]){
                return false;
            }
            
        }
        else{
            
            for(it= st_map.begin(); it!=st_map.end() ; it++ ){
                if( t[i] == it->second){
                    return false;
                }
            }
            
            
            st_map[s[i]] =t[i];
        }
        
    
    }
        
    return true;
        
    }
};