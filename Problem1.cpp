// Time Complexity : O(NKlogK) where N=Number of anagrams each having length K
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {

        unordered_map<string,vector<string>> map;

        string temp;

        vector<vector<string>> result;
       for(int i=0;i<strs.size();i++)
       {
           temp = strs[i];
           sort(strs[i].begin(),strs[i].end());
           map[strs[i]].push_back(temp);
       }
        unordered_map<string,vector<string>>::iterator it;
        for(it=map.begin();it!=map.end();it++)
        {
           result.push_back(it->second);
        }
        return result;
    }
};
