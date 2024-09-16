// Time Complexity                                  : O(N)
// Space Complexity                                 : O(2*N)
// Did this code successfully run on Leetcode       : Yes.
// Any problem you faced while coding this          : using char and string with maps in c++. I tried using something like - 
//                                                    unordered_map<char,string> mp but the comparison threw me some weird error. 
//                                                    But finally used this solution and it worked.


// Your code here along with comments explaining your approach

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        unordered_map<char,int> mp;
        unordered_map<string,int> mp2;
        int i=0;
        string token;
        stringstream x(s);
        while(getline(x,token,' ')) {
            if(i == pattern.size() || mp[pattern[i]] != mp2[token]) return false;
            mp[pattern[i]] = mp2[token] = i+1;
            i++;
        }
        
        return i==pattern.size();
        
    }
};