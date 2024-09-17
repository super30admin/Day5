/*
Time Complexity: O(nk)
Space Complexity: O(n)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        unordered_map<double, vector<string>> tans;
        for(int i = 0; i<strs.size(); i++){
            double m = getHash(strs[i]);
            if(tans.find(m)!=tans.end()){
                tans[m].push_back(strs[i]);
            } else{
            tans[m].push_back(strs[i]);
            }
        }

        for(auto i: tans){
            ans.push_back(i.second);
        }
        return ans;
    }
    vector<double> prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

    double getHash(string s){
        double hash = 1;
        for(int i = 0; i<s.size();i++){
            int ch = s[i];
            hash = hash * prime[ch-'a'];
        }
        return hash;
    }
};
