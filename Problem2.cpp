// Time Complexity : O(n)
// Space Complexity : O(1) if maps are not considered, O(n) if they are
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include<iostream>
#include<unordered_map>

using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length() != t.length())
            return false;
        
        unordered_map<char, char>m1;
        unordered_map<char, char>m2;
        
        for (int i = 0; i < s.length(); i++) {
            if (m1.find(s[i]) == m1.end() && m2.find(t[i]) == m2.end()) {
                m1[s[i]] = t[i];
                m2[t[i]] = s[i];
            } else {
                if (m1.find(s[i]) != m1.end() && (m1[s[i]] != t[i]))
                    return false;
                if (m2.find(t[i]) != m2.end() && (m2[t[i]] != s[i]))
                    return false;
            }
        }
        
        return true;
    }
};