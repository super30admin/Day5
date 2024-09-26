// Time Complexity : O(N) where N is size of s or t
// Space Complexity : O(2N) ~= O(N) assuming N is the size of s or t
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/isomorphic-strings/submissions/
// Submission Link: https://leetcode.com/submissions/detail/528828413/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> s_to_t;
        unordered_map<char, char> t_to_s;
        
        for(int i = 0; i < s.size(); i++){
            if(s_to_t.find(s[i]) == s_to_t.end() && t_to_s.find(t[i]) == t_to_s.end()){
                s_to_t[s[i]] = t[i];
                t_to_s[t[i]] = s[i];
            }
            else if(s_to_t[s[i]] != t[i] || t_to_s[t[i]] != s[i]){
                return false;
            }
        }
        
        return true;
    }
};