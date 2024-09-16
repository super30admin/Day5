// Time Complexity                                  : O(NM) , N is the size of the string vector and M is the size of the longest string in the vector.
// Space Complexity                                 : O(N) - used in the hashmap.
// Did this code successfully run on Leetcode       : Yes.
// Any problem you faced while coding this          : No.


// Your code here along with comments explaining your approach

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mp;
        vector<vector<string>> ans;
        
        for(auto str : strs) {
            string t = "";
            vector<int> ch(26,0); 
            for(auto c : str) {
                ch[c - 'a'] += 1;
            }
            
            for(int i=0;i<26;i++){
                t += to_string(ch[i]) + "#";
            }
            
            mp[t].push_back(str);
        }
        
        for(auto m : mp) {
            ans.push_back(m.second);
        }
        
        return ans;
    }
};