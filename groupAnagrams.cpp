//time complexity: O(n)
//space complexity:O(n)
//approach: hashmap, checking against a word if its anagrams exist
//solved on leetcode? yes
//problem faced? no
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>res;
        map<string, vector<string>>map;
        for(const auto&el: strs)
        {
            string t=el;
            sort(t.begin(),t.end());
            map[t].push_back(el);
        }
        for(const auto&el:map)
        {
            res.push_back(el.second);
        }
        return res;
    }
};