//Time O(n log n)
//Space O(n)
//Leetcode: yes
//Issue seen:None

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, int> mp;
        vector<vector<string>> result;

        for(int i=0; i<strs.size(); i++){
            string temp = strs[i];
            sort(temp.begin(), temp.end());
            if(mp.count(temp) !=0) {
                result[mp[temp]].push_back(strs[i]);
            } else {
               mp[temp]= result.size();;
               result.push_back({strs[i]});
            }
            
        }
        return result;

        
    }
};
