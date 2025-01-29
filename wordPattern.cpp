// Time Complexity : O(m+n) m is length of pattern n is len of word
// Space Complexity : O(n) to store word in set and hashmap. 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <unordered_map>
#include <unordered_set>
#include <vector>

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> mp;
        unordered_set<string> seen;
        vector<string> words;
        string word;
        stringstream iss(s);
        while(iss>>word) {
            words.push_back(word);
        }
                if (pattern.length()!= words.size()) return false;
        for (int i=0; i<pattern.length(); i++) {
            char c = pattern[i];
            string word = words[i];
            if (mp.find(c)!=mp.end()){ 
                if( mp[c] != word) return false;}
            else {
                if (seen.count(word)) return false;
                mp[c] = word;
                seen.insert(word);
            }
            }
            return true;
        
    }
};