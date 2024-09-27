// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : took me hours

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>Anagrams;
        vector<string> values;
        if(strs.size()==0){
            return Anagrams;
        }
        map<string, vector<string>> _map;
        for(int i=0;i<strs.size();i++){
            string Sorted = strs[i];
            sort(Sorted.begin(), Sorted.end());
            if(_map.find(strs[i])==_map.end()){
                _map.insert(pair<string, vector<string>>(Sorted, values));
            }
            _map.at(Sorted).push_back(strs[i]);
        }
        for(map<string,vector<string>>::iterator it = _map.begin(); it != _map.end(); ++it) {
            //key.push_back(it->first);
            Anagrams.push_back(it->second);
        }
        return Anagrams;
    }
};
