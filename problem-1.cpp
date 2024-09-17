//Time complexity - O(N*klogk) k =string size;
//Space Complexity - O(N*k);
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n=strs.size();
        unordered_map<string,vector<string>>m;
        vector<vector<string>>res;
        for(int i=0;i<n;i++){
            string s = strs[i];
            sort(s.begin(),s.end());
            m[s].push_back(strs[i]);
        }
        unordered_map<string,vector<string>>::iterator it;
        for(it=m.begin();it!=m.end();it++){
            res.push_back(it->second);
        }
        return res;
    }
};