// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
/*Sorting and Mapping sorted string with each element of string of vectors using hashmap
Checking if key is already present and correctly mapped*/
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> m;
        vector<string>temp;
        vector<vector<string>> ans;
        for(int i=0; i<strs.size(); i++){
            string original_string = strs[i];
            sort(strs[i].begin(), strs[i].end());
            if(m.contains(strs[i])==true){ //if map contains sorted string
                m[strs[i]].push_back(original_string); //then insert original string
            }
            else{
                temp.push_back(original_string);
                m.insert({strs[i],temp});
                temp.pop_back();
            }
        }
        for(auto it=m.begin();it!=m.end(); it++){
            ans.push_back(it->second);
        }
        return ans;
    }
};