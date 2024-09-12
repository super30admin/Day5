// Time Complexity : O(nk log k) - n is total strings and klogk is average sorting time of each string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        //sorted form is the key and the value is a vector of all inputs that have this sorted form
        map<string, vector<string>> dictionary;
        for(int i = 0; i < strs.size(); ++i){
            string key = strs[i];
            sort(key.begin(), key.end());
            dictionary[key].push_back(strs[i]);
        }
        for(auto const &i: dictionary){
            result.push_back(i.second);
        }
        return result;
    }
};