// Time Complexity : NKlogK
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> map;
        for(auto& string : strs) // O(N)
        {
            // store the sting in local variable and sort the key
            std::string key = string; 
            std::sort(key.begin(), key.end()); // KlogK

            // push it into the value vector
            map[key].push_back(string);
        }

        vector<vector<string>> result;
        for(auto& entry : map)
        {
            result.push_back(entry.second);
        }

        return result;
    }
};