// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// create a hashmap for characters as keys and words as values and then we will be checking for the one to one relation as we did in isomorphic strings
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;
        string str = "";
        for(int i = 0; i < s.size(); i++) {
            if(s[i] != ' ') str += s[i];
            else {
                v.push_back(str);
                str = "";
            }
        }
        // to push the last word
        v.push_back(str);

        // or
        // istringstream in(s);
        // string word;
        // vector<string> v;
        // while(in >> word) {
        //     v.push_back(word);
        // }
        
        if(pattern.size() != v.size()) return false;
        unordered_map<char, string> pMap;
        unordered_map<string, char> sMap;
        for(int i = 0; i < v.size(); ++i) {
            // imp code, if exists then check else put
            if((pMap.find(pattern[i]) != pMap.end() && pMap[pattern[i]] != v[i]) ||
                (sMap.find(v[i]) != sMap.end() && sMap[v[i]] != pattern[i]))
                return false;
            else {
                pMap[pattern[i]] = v[i];
                sMap[v[i]] = pattern[i];
            }
        }
        return true;
    }
};