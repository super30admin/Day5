// Time Complexity : O(NK) n is number of string and k is length of avg string
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    
    double primeC(string s){
        int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double x=1.0;
        for (auto& c:s) {
            x*=prime[c-'a'];
        }
        return x;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<double, vector<string>>mp;
        for (string& st:strs) {
            string n = st;
            double pp = primeC(st);
            mp[pp].push_back(st);
        }
        vector<vector<string>> ans;
        for(auto& v:mp){
            ans.push_back(v.second);
        }
        return ans;
    }
};