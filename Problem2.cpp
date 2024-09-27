// Problem 2:
// Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//-----------------------------------------------------------------------------
// Time Complexity : O(N) where N=Number of characters in s or t.
// Space Complexity : O(2N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
public:
    bool isIsomorphic(string s, string t) {

        vector<int> map1(256,-1);
        vector<int> map2(256, -1);

        for(int i=0;i<s.length();i++)
        {
            if(map1[s[i]] != map2[t[i]])
                return false;
            map1[s[i]] = i;
            map2[t[i]] = i;
        }
        return true;
    }
};
