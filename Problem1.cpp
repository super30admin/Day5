// Time Complexity : O(n*klogk)
// Space Complexity : O(n*k)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> res;
        vector<string> copy=strs;
        map<string, vector<int>> m;
        
        for(int i=0; i<copy.size(); i++){
           sort(copy[i].begin(), copy[i].end());
        }
        sort(copy.begin(), copy.end());
        
        for(int i=0; i<copy.size(); i++){
            if(m.find(copy[i])==m.end()){
                m[copy[i]].push_back(1);
            }
        }
        
        for(int i=0; i<strs.size(); i++){
            string temp = strs[i];
            sort(temp.begin(), temp.end());
            if(m.find(temp)!=m.end()){
                m[temp].push_back(i);
            }                
        }
        
        for(auto it=m.begin(); it!=m.end(); it++){
            string key = it->first;
            vector<int> val = it->second;
            vector<string> temp;
            for(int i=1; i<val.size(); i++){
                temp.push_back(strs[val[i]]);
            }
            
            res.push_back(temp);
        }
        
        
        return res;
    
    }
};
