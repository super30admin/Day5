/ Time Complexity : O(n * klogk) where k is the len of substrings
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        if (strs.size()== 0) return ans;
        
        unordered_map<string, vector<string>> umap;
        
        for (auto s : strs) {
            string v = s;
            sort(s.begin(), s.end());
            umap[s].push_back(v);
        }
        
        for (auto itr = umap.begin(); itr != umap.end(); itr++) {
            ans.push_back(itr->second);
        }
        
        return ans;
    }
};
