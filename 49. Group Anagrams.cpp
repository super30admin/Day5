//TC-O(N)
//SC-O(N)
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> m;
        vector<vector<string>> res;
        for(auto &p:strs){
            string temp=p;
            sort(p.begin(),p.end());
            m[p].push_back(temp);
        }
        for(auto &p:m){
            res.push_back(p.second);
        }
        return res;
    }
};
