// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// using two unordered maps to map each character in both strings together
// iterate over both strings
// check the mapping of each character to the other and see if they correlate

#include <iostream>
#include <vector>
#include<unordered_map>
using namespace std;


class Solution {
    public:
        bool isIsomorphic(string s, string t) {
            if(s.size()!=t.size()) return false;
            
            unordered_map<char,char>smap;
            unordered_map<char,char>tmap;
            for(int i=0; i < s.size();i++){
                
                if(!smap[s[i]]){
                    smap[s[i]]= t[i];
                    
                }
                else{
                    if(smap[s[i]]!= t[i]) return false;
                }
                
                
                if(!tmap[t[i]]){
                    tmap[t[i]]= s[i];
                    
                }
                else{
                    if(tmap[t[i]]!= s[i]) return false;
                }
            }
            return true;
        }
};