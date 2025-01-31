// Word patterns

//Time complexity: O(n) where n is max(pattern, s)
//Space : O(1)
//Code successfully compiled and run on leetcode

//Approach:
// Use two maps, one for pattern to s and one for s to pattern
// If key exists check if the vals are same. If different return false.

class Solution {
public:
    bool wordPattern(string pattern, string s)
    {
        vector<string> v;
        string word;
        stringstream iss(s);
        while (iss >> word)
            v.push_back(word);
      
        set<string> S; 
        if (pattern.size() != v.size())
            return false;
        unordered_map<char, string> m;
        for (int i = 0; i < pattern.size(); i++) {
            char ch = pattern[i];
            if (m.find(ch) != m.end()) {
                if (m[ch] != v[i])
                    return false;
            }
            else {
                if (S.count(v[i]) > 0)
                    return false;
                m[ch] = v[i];
                S.insert(v[i]);
            }
        }
        return true;
    }
};