/*
Iterate through each string in the input vector.
Sort each string to obtain a unique representation for anagrams.
Use the sorted string as a key in the map to group anagrams together.

Time Complexity: O(N * K * log(K))
Space Complexity: O(N * K)*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string ,vector<string>> k;
        vector<vector<string>> s;
        for(int i=0;i<strs.size();i++){
            string p =strs[i];
            sort(strs[i].begin(),strs[i].end());
            k[strs[i]].push_back(p);
        }
        for(auto i : k)
        {
            s.push_back(i.second);
        }

        return s;
        
    }
};