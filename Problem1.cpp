//time Complexity: O(NK)
//Space Complexity: O(NK)

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        vector<vector<string>> answer;
        unordered_map<string,vector<string>>new_map;
        for(auto & x: strs)
        {
            string temp =x;
            sort(x.begin(),x.end());
            new_map[x].push_back(temp);
        }
        for(auto & x:new_map)
        {
            answer.push_back(x.second);
        }
        return answer;
        
    }
};