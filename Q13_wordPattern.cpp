// ## Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

// Time complexity: O(n)
// Space complexity: O(1) 

// 2 hash map approach

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        unordered_map<char,string> st_map;
        unordered_map<string,int> ts_map;
        vector<string>v;
        string temp="";
        for(int i=0;i<s.size();i++)
        { 
            if(s[i]!=' ')
                temp+=s[i];
            else
            {
                v.push_back(temp);
                temp="";
            }
        }
        v.push_back(temp);
        
        if(v.size()!=pattern.size())
            return false;
        
        for(int i=0;i<pattern.size();i++)
        {
            
             if(st_map.find(pattern[i])!=st_map.end()){
            
            string mapping= st_map[pattern[i]];
            if( mapping != v[i]){
                return false;
            }
            
        }
        else{
            
            st_map[pattern[i]] =v[i];
        }
        
        if(ts_map.find(v[i])!=ts_map.end()){
            
            char mapping= ts_map[v[i]];
            if( mapping != pattern[i]){
                return false;
            }
            
        }
        else{
            
            ts_map[v[i]] =pattern[i];
        }
            
   
        }
        return true;
        
    }
};