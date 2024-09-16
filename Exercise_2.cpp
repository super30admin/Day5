// Time Complexity                                  : O(N)
// Space Complexity                                 : O(2*N) using 2 hashmaps
// Did this code successfully run on Leetcode       : Yes
// Any problem you faced while coding this          : No.


// Your code here along with comments explaining your approach


#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> mp;
        unordered_map<char,char> mp2;
        
        for(int i=0;i<s.size();i++) {
            if((mp[t[i]] and mp[t[i]] != s[i]) or (mp2[s[i]] and mp2[s[i]] != t[i])) return false;
            mp[t[i]] = s[i];
            mp2[s[i]] = t[i];
        }
        return true;
    }
};