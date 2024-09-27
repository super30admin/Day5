// Time Complexity : O(NKlogK)
// Space Complexity :O(NK)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        if(strs.empty() || strs.size() == 0){
        vector<vector<string>> mlist;
            return mlist;
        }
        unordered_map<string, vector<string>> map;
        vector<vector<string>> res;
        for(int i=0; i<strs.size(); i++){
            string s = strs[i];
            sort(strs[i].begin(),strs[i].end());
            map[strs[i]].push_back(s);

            
        }
        unordered_map<string,vector<string>>:: iterator it=map.begin();
        while(it!=map.end()){
            res.push_back(it->second);
            it++;
        }
        return res;
    }
};
