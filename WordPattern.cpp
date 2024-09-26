// Time Complexity : O(N + M) where N is size of pattern and M is size of s
// Space Complexity : O(N + M/2) assuming N is the size of pattern and in worstcase s would have each word of size 1 and a space 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/word-pattern/
// Submission Link: https://leetcode.com/submissions/detail/528821710/

class Solution {
public:
    vector<string> split(string s){
        string temp = "";
        vector<string> words;
        
        for(auto ch : s){
            if(ch == ' '){
                words.push_back(temp);
                temp = "";
            }
            else
                temp += ch;
        }
        words.push_back(temp);
        
        return words;
    }
    
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> p_to_s;
        unordered_map<string, char> s_to_p;
        
        vector<string> words = split(s);
        
        if(pattern.size() != words.size())
            return false;
        
        for(int i = 0; i < pattern.size(); i++){
            if(p_to_s.find(pattern[i]) == p_to_s.end() && s_to_p.find(words[i]) == s_to_p.end()){
                p_to_s[pattern[i]] = words[i];
                s_to_p[words[i]] = pattern[i];
            }
            else if(p_to_s[pattern[i]] != words[i] || s_to_p[words[i]] != pattern[i]){
                return false;
            }
        }
        
        return true;
    }
};