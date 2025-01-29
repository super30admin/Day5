// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// we take 2 hash maps and map both the strings to each other seperately
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) return false;
        unordered_map<char, char> sMap;
        unordered_map<char, char> tMap;
        for(int i = 0; i < s.size(); i++) {
            if((sMap[s[i]] && sMap[s[i]] != t[i]) || (tMap[t[i]] && tMap[t[i]] != s[i])) return false;
            else {
                sMap[s[i]] = t[i];
                tMap[t[i]] = s[i];
            }
        }
        return true;
    }
};